package com.kodilla.kodillajdbc;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTest {

    @Test
    void testConnect() {
        DbManager dbManager = DbManager.getInstance();
        Connection connection = dbManager.getConnection();
        assertNotNull(connection);
        System.out.println("Połączenie z bazą danych działa poprawnie.");
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {

        DbManager dbManager = DbManager.getInstance();


        String sqlQuery = """
        SELECT U.FIRSTNAME, U.LASTNAME, COUNT(P.ID) AS POST_COUNT
        FROM USERS U
        JOIN POSTS P ON U.ID = P.USER_ID
        GROUP BY U.ID
        HAVING COUNT(P.ID) >= 2;
        """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);


        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getInt("POST_COUNT"));
            counter++;
        }
        rs.close();
        statement.close();
        assertTrue(counter > 0);
    }
}
