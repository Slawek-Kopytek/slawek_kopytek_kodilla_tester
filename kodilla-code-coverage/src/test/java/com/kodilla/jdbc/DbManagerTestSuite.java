package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.sql.SQLException;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    /*@Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given
        String countQuery = "SELECT\tU.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "   FROM USERS U\n" +
                "   JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "  GROUP BY P.USER_ID\n" +
                " HAVING COUNT(*) >=2;";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getUsersAndPostsResultsCount(rs);
        insertUsers(statement);

        String sqlQuery = "SELECT U.ID FROM USERS U \n" +
               " WHERE U.ID NOT IN (SELECT USER_ID FROM POSTS)\n" +
               " LIMIT 2;";
        statement = createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

// Tutaj jest wadliwy kod (linia 71)
        while (resultSet.next()) {
            String id = resultSet.getString("ID");
            String toInsert = String.format("INSERT INTO POSTS (USER_ID, BODY) VALUES ('%s', \"TEST\")", id);
            statement.executeUpdate(toInsert);
            statement.executeUpdate(toInsert);
        }

        //When
        statement = createStatement();
        rs = statement.executeQuery(countQuery);

        //Then
        int counter = getUsersAndPostsResultsCount(rs);
        int expected = count;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }*/

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getUsersAndPostsResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%s, %s, %d%n",
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"),
                    rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        return counter;
    }



    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }
}