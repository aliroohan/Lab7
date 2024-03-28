package com.overriding;

public class Rectangle extends Shape{
    private double length;
    private double width;
    protected double getLength() {
        return length;
    }
    protected void setLength(double length) {
        this.length = length;
    }

    protected double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
}
