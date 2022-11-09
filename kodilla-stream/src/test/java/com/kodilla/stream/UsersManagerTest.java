package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void checkChemistUsernames() {
        //given
        List<String> chemistUsers = new ArrayList<>();
        chemistUsers.add("Walter White");
        chemistUsers.add("Gale Boetticher");
        //when
        List<String> result= UsersManager.filterChemistGroupUsernames();
        //then
        assertEquals(chemistUsers,result);
    }

    @Test
    public void checkOldestThanOverInput(){
        //given
        List<String> overInput = new ArrayList<>();
        overInput.add("Walter White");
        overInput.add("Walter White");
        overInput.add("Gus Firing");
        overInput.add("Mike Ehrmantraut");
        //when
        List<String> result = UsersManager.oldestThan(49);
        //then
        assertEquals(overInput, result);
    }

    @Test
    public void checkOverNumberOfPostsMoreThan100AndAgeBelow35(){
        //given
        List<String> users = new ArrayList<>();
        users.add("Jessie Pinkman");
        users.add("Tuco Salamanca");
        //users.add("Gus Firing");
        //when
        List<String> result = UsersManager.overNumberOfPostsMoreThan100AndAgeBelow35();
        //then
        //List<User> expectedUsers = new ArrayList<>();
        //expectedUsers.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        assertEquals(users, result);
    }
}

