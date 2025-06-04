
package com.surfacearea.calculator;

import com.surfacearea.shapes.*;
        import com.surfacearea.exceptions.InvalidDimensionException;
import com.surfacearea.utils.InputValidator;

import java.util.Scanner;

public class SurfaceAreaCalculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Surface Area Calculator");
        System.out.println("======================");

        while (true) {
            displayMenu();
            int choice = getMenuChoice();

            if (choice == 6) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            try {
                Shape shape = createShape(choice);
                if (shape != null) {
                    double area = shape.calculateArea();
                    System.out.printf("The area of the %s is: %.2f%n%n",
                            shape.getShapeName(), area);
                }
            } catch (InvalidDimensionException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nSelect a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Cylinder");
        System.out.println("6. Exit");
    }

    private static int getMenuChoice() {
        while (true) {
            try {
                System.out.print("Enter your choice (1-6): ");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 6) {
                    return choice;
                }
                System.out.println("Please enter a number between 1 and 6.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static Shape createShape(int choice) throws InvalidDimensionException {
        switch (choice) {
            case 1:
                double length = InputValidator.getPositiveDouble("Enter length: ");
                double width = InputValidator.getPositiveDouble("Enter width: ");
                return new Rectangle(length, width);
            case 2:
                double side = InputValidator.getPositiveDouble("Enter side length: ");
                return new Square(side);
            case 3:
                double radius = InputValidator.getPositiveDouble("Enter radius: ");
                return new Circle(radius);
            case 4:
                double base = InputValidator.getPositiveDouble("Enter base: ");
                double height = InputValidator.getPositiveDouble("Enter height: ");
                return new Triangle(base, height);
            case 5:
                double cylRadius = InputValidator.getPositiveDouble("Enter cylinder radius: ");
                double cylHeight = InputValidator.getPositiveDouble("Enter cylinder height: ");
                return new Cylinder(cylRadius, cylHeight);
            default:
                return null;
        }
    }
}
