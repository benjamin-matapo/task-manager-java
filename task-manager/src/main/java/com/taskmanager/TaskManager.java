package com.taskmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public Task create(String title) {
        Task t = new Task(nextId++, title);
        tasks.add(t);
        return t;
    }

    public List<Task> readAll() {
        return tasks;
    }

    public boolean update(int id, String newTitle, Boolean done) {
        Optional<Task> found = tasks.stream()
                .filter(t -> t.id == id).findFirst();
        found.ifPresent(t -> {
            if (newTitle != null) t.title = newTitle;
            if (done != null) t.done = done;
        });
        return found.isPresent();
    }

    public boolean delete(int id) {
        return tasks.removeIf(t -> t.id == id);
    }
}