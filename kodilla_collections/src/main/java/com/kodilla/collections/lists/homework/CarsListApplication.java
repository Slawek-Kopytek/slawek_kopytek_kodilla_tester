package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(100));
        cars.add(new Opel(70));
        cars.add(new Volkswagen(150));
        cars.add(new Volkswagen(125));
        cars.remove(1);
        Car volksvagen = new Volkswagen(150);
        cars.remove(volksvagen);

        System.out.println(cars.size());

        for (Car car : cars){
            CarUtils.describeCar(car);
        }
    }
}
