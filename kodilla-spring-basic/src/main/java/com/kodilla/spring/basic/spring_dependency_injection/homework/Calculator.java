package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public Calculator(Display display){
        this.display = display;
    }

    public double addition(double a, double b){
        double add = a + b;
        this.display.display(add);
        return add;
    }

    public double subtraction(double a, double b){
        double sub = a - b;
        this.display.display(sub);
        return sub;
    }

    public double division(double a, double b){
        double div = a / b;
        this.display.display(div);
        return div;
    }

    public double multiplication(double a, double b){
        double multi = a * b;
        this.display.display(multi);
        return multi;
    }
}
