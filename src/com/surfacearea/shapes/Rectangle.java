package com.surfacearea.shapes;

import com.surfacearea.exceptions.InvalidDimensionException;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Length and width must be positive");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}