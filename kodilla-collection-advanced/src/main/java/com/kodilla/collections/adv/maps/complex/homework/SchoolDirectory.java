package com.kodilla.collections.adv.maps.complex.homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal kowalski = new Principal("Kowalski", "I LO");
        Principal nowak = new Principal("Nowak", "XXV LO");
        Principal wisniewski = new Principal("Wiśniewski", "XXXI LO");


        School kowalskiSchool = new School(Arrays.asList(15.0, 20.0, 22.0));
        School nowakSchool = new School(Arrays.asList(29.0, 21.0, 26.0));
        School wisniewskiSchool = new School(Arrays.asList(11.0, 8.0, 14.0));


        schools.put(kowalski, kowalskiSchool);
        schools.put(nowak,nowakSchool);
        schools.put(wisniewski, wisniewskiSchool);

        for (Map.Entry<Principal, School> principalEntry : schools.entrySet()){
            System.out.println(principalEntry.getKey().getLastname() + ", school name "
            + principalEntry.getKey().getSchoolName() + ", total number of students: "
            + principalEntry.getValue().getSum());
        }

    }
}
