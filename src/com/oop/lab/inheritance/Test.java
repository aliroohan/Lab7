package com.oop.lab.inheritance;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        double radius = scanner.nextDouble();
        System.out.print("Enter Height : ");
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder("Red", radius, height);

        System.out.print("Area of Cylinder : ");
        System.out.printf("%.2f", cylinder.calculateArea());
    }
}
