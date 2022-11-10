package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Agnieszka", new Teacher("Krzysztof Krawczyk")));
        students.add(new Student("Jan", null));
        students.add(new Student("Anna", new Teacher("Maciej Nowicki")));
        students.add(new Student("Tomasz", null));
        students.add(new Student("Andrzej", new Teacher("Adam Małysz")));
        students.add(new Student("Dominika", null));

        for(Student student : students){
            String result = getNameOfTeacher(student);
            System.out.println("student: " + student.getName() + ", teacher: " + result);
        }
    }

    public static String getNameOfTeacher (Student student){
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        return optionalTeacher.orElse(new Teacher("<undefined>")).getName();
    }
}
