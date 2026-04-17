package com.taskmanager;

public class Task {
    public int id;
    public String title;
    public boolean done;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.done = false;
    }

    @Override
    public String toString() {
        String status = done ? "[x]" : "[ ]";
        return status + " #" + id + " - " + title;
    }
}