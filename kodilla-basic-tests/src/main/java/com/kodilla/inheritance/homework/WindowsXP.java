package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {
    public WindowsXP (int openYear, int closeYear){
        super(openYear, closeYear);
    }

    @Override
    public void turnOn(){
        System.out.println("Welcome in the best operating system ever from " + showOpenYear());
    }

    @Override
    public void turnOff(){
        System.out.println("Support for this system shut down in " + showCloseYear());
    }
}
