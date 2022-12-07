package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldCreateRandomCar(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        //when
        String carType = car.getCarType();
        //then
        List<String> result = Arrays.asList("Sedan", "Cabrio", "SUV");
        Assertions.assertTrue(result.contains(carType));
    }

    @Test
    public void shouldHaveLightOn(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("headLights");
        //when
        boolean result = car.hasHeadlightsTurnedOn();
        //then
        Assertions.assertTrue(result);
    }

}