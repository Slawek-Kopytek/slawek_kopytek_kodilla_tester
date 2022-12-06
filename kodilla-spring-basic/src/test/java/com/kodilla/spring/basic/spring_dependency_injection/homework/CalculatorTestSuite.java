package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);


    @Test
    public void shouldReturnAddValues(){
        Double add = bean.addition(2.0, 8.0);
        Assertions.assertEquals(10, add);
    }

    @Test
    public void shouldReturnSubValues(){
        Double sub = bean.subtraction(2.0, 8.0);
        Assertions.assertEquals(-6, sub);
    }

    @Test
    public void shouldReturnDivValues(){
        Double div = bean.division(2.0, 8.0);
        Assertions.assertEquals(0.25, div);
    }

    @Test
    public void shouldReturnMultiValues(){
        Double multi = bean.multiplication(2.0, 8.0);
        Assertions.assertEquals(16, multi);
    }

}