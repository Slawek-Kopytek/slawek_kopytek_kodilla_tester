package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void testAveragePostsOver40AgeIncluded() {
        List<User> users = new ArrayList<>();
        //given
        users.add(new User("Walter White", 60, 3957, "Chemistry"));
        users.add(new User("Walter White", 50, 22, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 748, "Sales"));
        users.add(new User("Tuco Salamanca", 39, 177, "Manager"));
        users.add(new User("Gus Firing", 49, 4, "Board"));
        users.add(new User("Gale Boetticher", 40, 98, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 4832, "Security"));
        //when
        double testAveragePostsOver40 = ForumStats.getAverageNumbersOfPostsForUsersOver40(users);
        //then
        assertEquals(1782.6, testAveragePostsOver40);
    }

    @Test
    public void testAveragePostsBelow40() {
        List<User> users = new ArrayList<>();
        //given
        users.add(new User("Walter White", 60, 3957, "Chemistry"));
        users.add(new User("Walter White", 50, 22, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 748, "Sales"));
        users.add(new User("Tuco Salamanca", 39, 177, "Manager"));
        users.add(new User("Gus Firing", 49, 4, "Board"));
        users.add(new User("Gale Boetticher", 40, 98, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 4832, "Security"));
        //when
        double testAveragePostsBelow40 = ForumStats.getAverageNumbersOfPostsForUsersBelow40(users);
        //then
        assertEquals(462.5, testAveragePostsBelow40);
    }
}