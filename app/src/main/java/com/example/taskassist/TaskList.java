package com.example.taskassist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.PriorityQueue;


public class TaskList extends ArrayAdapter<Task>{

    private final Activity context;
    private List<Task> tasks;

    public TaskList(Activity context, List<Task> tasks) {
        super(context, R.layout.layout_task_list, tasks);
        this.context = context;
        this.tasks = tasks;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_task_list, null, true);

        TextView textViewTitle = (TextView) listViewItem.findViewById(R.id.textViewTitle);
        TextView textViewDeadline = (TextView) listViewItem.findViewById(R.id.textViewDeadline);

        Task task = tasks.get(position);
        textViewTitle.setText(task.getTitle());
        textViewDeadline.setText(task.getDeadline());
        return listViewItem;
    }

}
