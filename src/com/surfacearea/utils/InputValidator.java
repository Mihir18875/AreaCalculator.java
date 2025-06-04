package com.surfacearea.utils;
import java.util.Scanner;

public class InputValidator {
    private static final Scanner scanner = new Scanner(System.in);

    public static double getPositiveDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Value must be positive. Please try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
