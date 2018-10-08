package com.chemutai.recyclertask;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {

    ArrayList<Task> tasksArray;
    Context tContext;

    public TaskAdapter(ArrayList<Task> tasksArray, Context tContext) {
        this.tasksArray = tasksArray;
        this.tContext = tContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View t= LayoutInflater.from(parent.getContext()).inflate(R.layout.task_layout, parent, false);//display(inflate)
        return new MyViewHolder(t);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final Task t = tasksArray.get(position);
        holder.task.setText(t.getTask());
        holder.dateAdded.setText(t.getDateAdded());
        holder.dateCompleted.setText(t.getDateCompleted());
        holder.chkStatus.setChecked(t.isChecked());



        holder.chkStatus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if (isChecked==true){
                      Toast.makeText(tContext, "The task is checked", Toast.LENGTH_SHORT).show();
                }
                else
                  {
                      Toast.makeText(tContext, "The task has been unchecked", Toast.LENGTH_SHORT).show();
                  }

            }
        });

    }

    @Override
    public int getItemCount() {
        return tasksArray.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

       TextView task, dateAdded, dateCompleted;
       CheckBox chkStatus;

       public MyViewHolder(View itemView){
           super(itemView);

           task = itemView.findViewById(R.id.txtTask);
           dateAdded = itemView.findViewById(R.id.txtDateAdded);
           dateCompleted = itemView.findViewById(R.id.txtDateCompleted);
           chkStatus = itemView.findViewById(R.id.chkStatus);
       }
    }

      /*  holder.chkStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (tasksArray.contains(t)){
                   notifyDataSetChanged();
//                   TaskAdapter.this.notify();
                   Toast.makeText(tContext, "Task unchecked " + t.getTask(), Toast.LENGTH_SHORT).show();
               }
               else
               {
                   return;
               }
            }
        });*/
}
