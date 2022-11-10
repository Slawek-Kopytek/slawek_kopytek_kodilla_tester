package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void studentHasTeacher(){
        Student marek = new Student("Anna", new Teacher("Maciej Nowicki"));
        assertEquals("Maciej Nowicki", Application.getNameOfTeacher(marek));
    }

    @Test
    public void studentHasNotTeacher(){
        Student marek = new Student("Jan", null);
        assertEquals("<undefined>", Application.getNameOfTeacher(marek));
    }


}