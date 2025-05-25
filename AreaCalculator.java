import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(Scanner sc) {
        System.out.print("Enter radius of the circle: ");
        this.radius = sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(Scanner sc) {
        System.out.print("Enter length of the rectangle: ");
        this.length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        this.width = sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(Scanner sc) {
        System.out.print("Enter base of the triangle: ");
        this.base = sc.nextDouble();
        System.out.print("Enter height of the triangle: ");
        this.height = sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Square implements Shape {
    private double side;

    public Square(Scanner sc) {
        System.out.print("Enter side of the square: ");
        this.side = sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.print("Choose a shape (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                shape = new Circle(sc);
                break;
            case 2:
                shape = new Rectangle(sc);
                break;
            case 3:
                shape = new Triangle(sc);
                break;
            case 4:
                shape = new Square(sc);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(1);
        }

        System.out.printf("Calculated Area: %.2f\n", shape.calculateArea());
        sc.close();
    }
}