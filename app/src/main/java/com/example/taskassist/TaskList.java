package com.example.taskassist;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;


public class TaskList extends ArrayAdapter<Task> {

    private final Activity context;
    private List<Task> tasks;

    public TaskList(Activity context, List<Task> tasks) {
        super(context, R.layout.layout_task_list, tasks);
        this.context = context;
        this.tasks = tasks;
    }

}
