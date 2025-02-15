// Exercise #1

import java.util.Scanner;
public class PolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a polygon (triangle, square, rectangle): ");
        String type = scanner.nextLine();
        double area = 0;

        if (type.equals("triangle")) {
            System.out.println("Enter the base:");
            double base = scanner.nextDouble();
            System.out.println("Enter the height:");
            double height = scanner.nextDouble();
            area = (base * height) / 2;
        } else if (type.equals("square")) {
            System.out.println("Enter the side length:");
            double side = scanner.nextDouble();
            area = side * side;
        } else if (type.equals("rectangle")) {
            System.out.println("Enter the base:");
            double base = scanner.nextDouble();
            System.out.println("Enter the height:");
            double height = scanner.nextDouble();
            area = base * height;
        } else {
            System.out.println("Invalid polygon.");
        }

        if (area > 0) {
            System.out.println("The area of the " + type + " is: " + area);
        }

        scanner.close();
    }
}