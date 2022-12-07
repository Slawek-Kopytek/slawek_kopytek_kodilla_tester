package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Car randomCar(){
        Car car;
        Random generator = new Random();
        int random = generator.nextInt(4);
        if(random == 1 || random == 3){
            car = new Sedan();
        } else if (random == 2){
            car = new Cabrio();
        } else {
            car = new SUV();
        }
        return car;
    }

    @Bean
    public Car headLights(){
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(20,0)) && time.isBefore(LocalTime.of(6,0)))
            randomCar().hasHeadlightsTurnedOn();
        return randomCar();
    }
}
