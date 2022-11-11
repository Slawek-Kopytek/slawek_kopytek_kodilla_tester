package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double usersOver40 = getAverageNumbersOfPostsForUsersOver40(UserRepository.getUsersList());
        System.out.println(usersOver40);
        double usersBelow40 = getAverageNumbersOfPostsForUsersBelow40(UserRepository.getUsersList());
        System.out.println(usersBelow40);
    }

    public static double getAverageNumbersOfPostsForUsersOver40(List<User> users){
        return users
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }

    public static double getAverageNumbersOfPostsForUsersBelow40(List<User> users){
        return users
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }
}
