package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100, 35, 20);
        doRace(ford);

        Opel opel = new Opel(50, 40, 25);
        doRace(opel);

        Volkswagen volkswagen = new Volkswagen(75, 50, 30);
        doRace(volkswagen);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed(); // Ja zrobić aby za 2 razem przyspieszenie było większe
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
