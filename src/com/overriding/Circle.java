package com.overriding;

public class Circle extends Shape{
    private double radius;

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
}
