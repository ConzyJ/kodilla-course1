package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BoardTestSuite {

    @Test
    void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        board.getToDoList().addTask("Zadanie 1");
        board.getInProgressList().addTask("Zadanie 2");
        board.getDoneList().addTask("Zadanie 3");

        // Then
        assertEquals(1, board.getToDoList().getTasks().size(), "Lista To Do powinna mieć 1 element");
        assertEquals(1, board.getInProgressList().getTasks().size(), "Lista In Progress powinna mieć 1 element");
        assertEquals(1, board.getDoneList().getTasks().size(), "Lista Done powinna mieć 1 element");

        // Logowanie wyników do konsoli
        System.out.println("To Do: " + board.getToDoList().getTasks());
        System.out.println("In Progress: " + board.getInProgressList().getTasks());
        System.out.println("Done: " + board.getDoneList().getTasks());
    }
}
