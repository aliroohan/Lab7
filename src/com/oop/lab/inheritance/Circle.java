package com.oop.lab.inheritance;

public class Circle {
    private double radius;
    private String color;

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        setRadius(radius);
        setColor(color);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle" +
                "radius=" + radius
                + "color=" + color;
    }
}
