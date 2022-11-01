package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car{
    private int speed;
    private int accelerate;
    private int brake;

    public Volkswagen(int speed){
        this.speed = speed;
        this.accelerate = 50;
        this.brake = 25;
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
