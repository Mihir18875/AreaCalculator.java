package com.surfacearea.shapes;

import com.surfacearea.exceptions.InvalidDimensionException;

public class Square implements Shape {
    private double side;

    public Square(double side) throws InvalidDimensionException {
        if (side <= 0) {
            throw new InvalidDimensionException("Side length must be positive");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    public double getSide() {
        return side;
    }
}
