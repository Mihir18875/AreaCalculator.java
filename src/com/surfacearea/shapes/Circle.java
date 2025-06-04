package com.surfacearea.shapes;

import com.surfacearea.exceptions.InvalidDimensionException;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) throws InvalidDimensionException {
        if (radius <= 0) {
            throw new InvalidDimensionException("Radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }
}