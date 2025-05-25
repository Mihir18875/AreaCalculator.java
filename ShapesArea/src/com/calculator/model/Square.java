package com.calculator.model;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side; // Area = side²
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}