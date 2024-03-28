package com.overriding;

public class Shape {
    private String color;

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public Shape(String color) {
        setColor(color);
    }
}
