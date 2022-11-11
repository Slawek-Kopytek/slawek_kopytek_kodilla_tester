package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UserRepository.getUsersList()
                .stream()
                .mapToInt(User::getAge)
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}
