package com.surfacearea.shapes;

import com.surfacearea.exceptions.InvalidDimensionException;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) throws InvalidDimensionException {
        if (base <= 0 || height <= 0) {
            throw new InvalidDimensionException("Base and height must be positive");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}