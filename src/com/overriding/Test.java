package com.overriding;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color of circle : ");
        String cirColor = scanner.nextLine();
        System.out.print("Enter Radius : ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(cirColor, radius);

        System.out.print("Enter the color of rectangle : ");
        String recColor = scanner.next();
        System.out.print("Enter Length : ");
        double length = scanner.nextDouble();
        System.out.print("Enter Width : ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(recColor, length, width);

        System.out.println("Circle Details :");
        System.out.println("Color : " + circle.getColor());
        System.out.printf("Area : %.2f\n", circle.calculateArea());
        System.out.printf("Perimeter : %.2f\n",circle.calculatePerimeter());

        System.out.println();

        System.out.println("Rectangle Details :");
        System.out.println("Color : " + rectangle.getColor());
        System.out.println("Area : " + rectangle.calculateArea());
        System.out.println("Perimeter : " + rectangle.calculatePerimeter());
    }
}
