package com.chemutai.recyclertask;

import android.widget.CheckBox;

public class Task {

private String task, dateAdded, dateCompleted;
private boolean checked;

    public Task(String task, String dateAdded, String dateCompleted, boolean checked) {
        this.task = task;
        this.dateAdded = dateAdded;
        this.dateCompleted = dateCompleted;
        this.checked = checked;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
