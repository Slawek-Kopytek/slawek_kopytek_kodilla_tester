package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    private int accelerate;
    private int brake;


    public Ford(int speed){
        this.speed = speed;
        this.accelerate = 40;
        this.brake = 20;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed(double i) {
         speed = (int) (accelerate * i) + speed;
    }

    @Override
    public void decreaseSpeed() {
        speed -= brake;
    }
}


