package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> ageOfUsers = oldestThan(49);
        System.out.println(ageOfUsers);
        List<String> over = overNumberOfPostsMoreThan100AndAgeBelow35();
        System.out.println(over);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<String> oldestThan(int i){
        List<String> oldestUsers = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= i)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return oldestUsers;
    }

    public static List<String> overNumberOfPostsMoreThan100AndAgeBelow35(){
        List<String> username = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 100)
                .filter(user -> user.getAge() <= 35)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return username;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
