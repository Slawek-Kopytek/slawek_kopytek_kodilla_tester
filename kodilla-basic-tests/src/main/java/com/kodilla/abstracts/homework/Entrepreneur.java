package com.kodilla.abstracts.homework;

public class Entrepreneur extends Job{


    public Entrepreneur() {
        super(25000, "care about everything inside company");
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}
