package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public void process(Shape shape){
        System.out.println(shape.getName() + " has " + shape.calculateArea() + " area");
        System.out.println(shape.getName() + " has " + shape.calculatePerimeter() + " perimeter");
    }
}