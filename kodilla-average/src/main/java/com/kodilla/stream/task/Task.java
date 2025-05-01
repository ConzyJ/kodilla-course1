package com.kodilla.stream.task;

import java.time.LocalDate;

public final class Task {
    private final String title;
    private final LocalDate createdDate;

    public Task(String title, LocalDate createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
