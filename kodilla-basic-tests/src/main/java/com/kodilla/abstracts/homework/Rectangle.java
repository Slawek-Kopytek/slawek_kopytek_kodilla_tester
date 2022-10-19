package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    private double a;
    private double b;
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = 2 * (a + b);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area;
        area = a * b;
        return area;
    }
}
