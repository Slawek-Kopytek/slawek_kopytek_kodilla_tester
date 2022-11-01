package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(70);
        doRace(ford);

        Opel opel = new Opel(70);
        doRace(opel);

        Volkswagen volkswagen = new Volkswagen(70);
        doRace(volkswagen);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
