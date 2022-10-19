package com.kodilla.abstracts.homework;

public class Doctor extends Job{
    public Doctor() {
        super(15000, "cure people to not get worse");
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}
