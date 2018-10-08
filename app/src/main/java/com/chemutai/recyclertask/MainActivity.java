package com.chemutai.recyclertask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView tasksList;
    TaskAdapter adapter;
    ArrayList<Task> tasksArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasksList=findViewById(R.id.tasks);

        tasksArray = new ArrayList<>();


        tasksArray.add(new Task("Routine tasks", "20/09/2018", "29/09/2018", false));
        tasksArray.add(new Task("Problems","30/08/2018", "14/09/2018", false));
        tasksArray.add(new Task("Incidental", "29/06/2018", "07/07/2018", false));
        tasksArray.add(new Task("Projects", "13/05/2018", "13/07/2018", false));

        adapter=new TaskAdapter(tasksArray, this);
        tasksList.setLayoutManager(new LinearLayoutManager(this));//changing the layout of users
        tasksList.setAdapter(adapter);


    }
}
