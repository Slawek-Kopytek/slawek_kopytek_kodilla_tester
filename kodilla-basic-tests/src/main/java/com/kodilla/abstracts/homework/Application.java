package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 8, 12, 10);
        Shape rectangle = new Rectangle(10, 30);
        Shape trapezoid = new Trapezoid(10, 15, 8, 8, 20);
        ShapeProcessor processor = new ShapeProcessor();
        processor.process(trapezoid);
        processor.process(triangle);
        processor.process(rectangle);
    }
}
