package com.example.taskassist;

public class Task {
    private String title;
    private String deadline;
    private int priority;

    public Task(String title, String deadline, int priority){
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
