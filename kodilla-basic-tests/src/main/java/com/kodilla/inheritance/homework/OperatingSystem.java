package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int openYear;
    private int closeYear;

    public OperatingSystem(int openYear, int closeYear){
        this.openYear = openYear;
        this.closeYear = closeYear;
    }
    public void turnOn(){
        System.out.println("Welcome in brand new operating system from " + openYear);
    }

    public void turnOff(){
        System.out.println("Operating system shut down in: " + closeYear);
    }

    public int showOpenYear(){
        return openYear;
    }

    public int showCloseYear(){
        return openYear;
    }
}
