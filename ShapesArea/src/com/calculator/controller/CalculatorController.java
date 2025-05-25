package com.calculator.controller;

import com.calculator.service.CalculationService;
import com.calculator.util.InputValidator;
import java.util.Scanner;

public class CalculatorController {
    private final CalculationService service = new CalculationService();
    private final InputValidator validator = new InputValidator();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("=== Surface Area Calculator ===");
        while (true) {
            displayMenu();
            int choice = getIntInput("Enter your choice (1-5): ");

            switch (choice) {
                case 1 -> calculateCircle();
                case 2 -> calculateSquare();
                case 3 -> calculateRectangle();
                case 4 -> calculateTriangle();
                case 5 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice! Please enter 1-5.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("\nSelect a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.println("5. Exit");
    }

    private void calculateCircle() {
        System.out.println("\n[Circle Calculation]");
        double radius = getPositiveInput("Enter radius: ");
        System.out.println(service.calculateAndDisplay(service.createCircle(radius)));
    }

    private void calculateSquare() {
        System.out.println("\n[Square Calculation]");
        double side = getPositiveInput("Enter side length: ");
        System.out.println(service.calculateAndDisplay(service.createSquare(side)));
    }

    private void calculateRectangle() {
        System.out.println("\n[Rectangle Calculation]");
        double length = getPositiveInput("Enter length: ");
        double width = getPositiveInput("Enter width: ");
        System.out.println(service.calculateAndDisplay(service.createRectangle(length, width)));
    }

    private void calculateTriangle() {
        System.out.println("\n[Triangle Calculation]");
        double base = getPositiveInput("Enter base: ");
        double height = getPositiveInput("Enter height: ");
        System.out.println(service.calculateAndDisplay(service.createTriangle(base, height)));
    }

    private int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (1-5).");
            }
        }
    }

    private double getPositiveInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(scanner.nextLine());
                if (validator.validatePositive(value)) {
                    return value;
                } else {
                    System.out.println("Value must be positive! Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
            }
        }
    }
}