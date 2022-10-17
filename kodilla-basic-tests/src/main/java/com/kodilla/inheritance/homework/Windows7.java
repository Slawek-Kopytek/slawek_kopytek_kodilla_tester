package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem{
    public Windows7(int openYear, int closeYear){
        super(openYear, closeYear);
    }

    @Override
    public void turnOn(){
        System.out.println("Path-breaking system from the future was available in " + showOpenYear());
    }
}
