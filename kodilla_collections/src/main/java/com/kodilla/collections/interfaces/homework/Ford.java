package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    private int accelerate;
    private int brake;

    public Ford(int speed, int accelerate, int brake){
        this.speed = speed;
        this.accelerate = accelerate;
        this.brake = brake;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += accelerate;
    }

    @Override
    public void decreaseSpeed() {
        speed -= brake;
    }
}


