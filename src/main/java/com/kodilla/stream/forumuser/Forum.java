package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "john_doe", 'M', LocalDate.of(2000, 5, 15), 10));
        userList.add(new ForumUser(2, "jane_doe", 'F', LocalDate.of(1995, 8, 21), 15));
        userList.add(new ForumUser(3, "mike_smith", 'M', LocalDate.of(2010, 3, 10), 5));
        userList.add(new ForumUser(4, "lucy_adams", 'F', LocalDate.of(2003, 12, 30), 3));
        userList.add(new ForumUser(5, "peter_parker", 'M', LocalDate.of(1990, 7, 7), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
