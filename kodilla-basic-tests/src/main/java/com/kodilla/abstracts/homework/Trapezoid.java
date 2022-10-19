package com.kodilla.abstracts.homework;

public class Trapezoid extends Shape{
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;
    public Trapezoid(double a, double b,double c, double d, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public String getName() {
        return "Trapezoid";
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = a + b + c + d;
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area;
        area = 0.5 * h * (a + b);
        return area;
    }
}
