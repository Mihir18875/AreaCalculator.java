package com.surfacearea.shapes;

import com.surfacearea.exceptions.InvalidDimensionException;

public class Cylinder implements Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) throws InvalidDimensionException {
        if (radius <= 0 || height <= 0) {
            throw new InvalidDimensionException("Radius and height must be positive");
        }
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        // Surface area of cylinder = 2πr² + 2πrh
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    @Override
    public String getShapeName() {
        return "Cylinder";
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}