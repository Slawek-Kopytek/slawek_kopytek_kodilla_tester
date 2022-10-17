package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args){
        WindowsXP windowsXP = new WindowsXP(2001, 2019);
        windowsXP.turnOn();
        windowsXP.turnOff();

        Windows7 windows7 = new Windows7(2009,2020);
        windows7.turnOn();
        windows7.turnOff();
    }
}
