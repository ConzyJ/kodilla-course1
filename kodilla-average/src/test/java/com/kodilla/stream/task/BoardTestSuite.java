package com.kodilla.stream.task;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTestSuite {

    @Test
    void testAddTaskListAverageWorkingOnTask() {
        // Given
        Board board = new Board();

        TaskList inProgress = new TaskList("In Progress");
        inProgress.addTask(new Task("Task 1", LocalDate.now().minusDays(5)));
        inProgress.addTask(new Task("Task 2", LocalDate.now().minusDays(10)));
        inProgress.addTask(new Task("Task 3", LocalDate.now().minusDays(15)));
        inProgress.addTask(new Task("Task 4", LocalDate.now().minusDays(20)));

        board.addTaskList(inProgress);

        // When
        List<TaskList> taskListsInProgress = board.getTaskLists();

        OptionalDouble averageDays = taskListsInProgress.stream()
                .filter(taskList -> taskList.getName().equals("In Progress"))
                .flatMap(taskList -> taskList.getTasks().stream())
                .mapToLong(task -> ChronoUnit.DAYS.between(task.getCreatedDate(), LocalDate.now()))
                .average();

        // Then
        assertEquals(12.5, averageDays.getAsDouble(), 0.01);
    }
}
