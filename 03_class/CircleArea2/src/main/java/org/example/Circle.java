package org.example;

public class Circle {
    private int r;
    public Circle(int a) {
        r = a;
    }

    public double getArea() {
        return r * r * 3.141592;
    }
}
