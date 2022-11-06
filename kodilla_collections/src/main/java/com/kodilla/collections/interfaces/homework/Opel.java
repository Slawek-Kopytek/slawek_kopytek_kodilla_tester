package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;
    private int accelerate;
    private int brake;

    public Opel(int speed){
        this.speed = speed;
        this.accelerate = 30;
        this.brake = 15;
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
