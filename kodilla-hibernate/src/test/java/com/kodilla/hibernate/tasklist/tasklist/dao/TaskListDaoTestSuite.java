package com.kodilla.hibernate.tasklist.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "ToDo List";
    private static final String DESCRIPTION = "Things to do today";

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        // When
        List<TaskList> result = taskListDao.findByListName(LISTNAME);

        // Then
        assertEquals(1, result.size());
        assertEquals(DESCRIPTION, result.get(0).getDescription());

        // CleanUp
        taskListDao.deleteAll();
    }
}
