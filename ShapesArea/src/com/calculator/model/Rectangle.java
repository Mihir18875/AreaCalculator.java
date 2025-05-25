package com.calculator.model;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; // Area = length × width
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}