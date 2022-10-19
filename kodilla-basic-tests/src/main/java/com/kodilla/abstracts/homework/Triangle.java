package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area;
        area = 0.5 * b * h;
        return area;
    }


}
