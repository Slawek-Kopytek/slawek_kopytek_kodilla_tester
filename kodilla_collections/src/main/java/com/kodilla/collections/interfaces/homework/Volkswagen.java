package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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
    public void increaseSpeed(double i) {
        speed = (int) (accelerate * i) + speed;
    }

    @Override
    public void decreaseSpeed() {
        speed -= brake;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volkswagen that = (Volkswagen) o;
        return speed == that.speed
                && accelerate == that.accelerate
                && brake == that.brake;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, accelerate, brake);
    }
}
