package com.kodilla.stream.task;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TaskList(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public String getName() {
        return name;
    }
}
