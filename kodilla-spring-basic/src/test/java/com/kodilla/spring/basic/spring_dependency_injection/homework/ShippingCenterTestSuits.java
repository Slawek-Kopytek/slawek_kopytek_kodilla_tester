package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuits {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter bean = context.getBean(ShippingCenter.class);


    @Test
    public void shouldReturnProvidedDeliveryUnder30(){
        String result = bean.sendPackage("Warszawa", 30.0);
        Assertions.assertEquals("Package delivered to: Warszawa", result);
    }


    @Test
    public void shouldReturnProvidedDeliveryAbove30(){
        String result = bean.sendPackage("Warszawa", 30.1);
        Assertions.assertEquals("Package not delivered to: Warszawa", result);
    }
}