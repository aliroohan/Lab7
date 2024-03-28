package com.oop.lab.inheritance;

public class Cylinder extends Circle{
    private double height;

    protected double getHeight() {
        return height;
    }

    protected void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        setHeight(height);
    }

    @Override
    public double calculateArea() {
        return 2 * (super.calculateArea() + Math.PI * getRadius() * height);
    }

    @Override
    public String toString() {
        return "Cylinder" +
                "radius=" + getRadius() +
                ", height=" + height;
    }
}
