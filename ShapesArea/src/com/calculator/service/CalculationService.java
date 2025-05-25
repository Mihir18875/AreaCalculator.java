package com.calculator.service;
import com.calculator.model.*;

public class CalculationService {
    public Shape createCircle(double radius) { return new Circle(radius); }
    public Shape createSquare(double side) { return new Square(side); }
    public Shape createTriangle(double base, double height) {
        return new Triangle(base, height);}
    public Shape createRectangle(double length, double width){
        return new Rectangle(length,width);}
    public String calculateAndDisplay(Shape shape) {
        return String.format("Area of %s: %.2f", shape.getShapeName(), shape.calculateArea());
    }
}