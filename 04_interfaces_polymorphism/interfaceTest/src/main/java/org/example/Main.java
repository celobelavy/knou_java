package org.example;
interface Movable {
    void add(double dx, double dy);
    void sub(double dx, double dy);
}

interface Scalable {
    void mul(double s);
    void div(double s);
}
class Point implements Movable, Scalable {
    double x, y;
    public void add(double dx, double dy) {
        x += dx;
        y += dy;
    }
    public void sub(double dx, double dy) {
        x -= dx;
        y -= dy;
    }
    public void mul(double s) {
        x *= s;
        y *= s;
    }
    public void div(double s) {
        x /= s;
        y /= s;
    }
}
interface Figure {
    double getArea();
}

class Triangle implements Figure {
    private double height, width;
    public Triangle(double h, double w) {
        height = h;
        width = w;
    }
    public double getArea() {
        return height * width * 0.5;
    }
}
public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(3.0, 4.0);
        System.out.println(t.getArea());
    }
}