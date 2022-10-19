package com.kodilla.abstracts.homework;

public class Driver extends Job{

    public Driver() {
        super(6000, "arrive on time");
    }

    @Override
    public String getResponsibilities(){
        return responsibilities;
    }
}
