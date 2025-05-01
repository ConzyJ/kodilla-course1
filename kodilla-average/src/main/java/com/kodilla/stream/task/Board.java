package com.kodilla.stream.task;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }
}

