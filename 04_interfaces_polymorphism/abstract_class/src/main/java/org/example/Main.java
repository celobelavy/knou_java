package org.example;
abstract class Shape {
    public double height, width;
    public Shape(double h, double w) {height = h; width = w;}
    public void setHeight(double h) {height = h;}
    public void setWidth(double w) {width = w;}
    public double getHeight() {return height;}
    public double getWidth() {return width;}
    public abstract double getArea();
}

class Triangle extends Shape {
    public Triangle(double h, double w) {super(h, w);}
    public double getArea() {return height * width * 0.5;}
}

class Box extends Shape {
    public Box(double h, double w) {super(h, w);}
    public double getArea() {return height * width;}
}
public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle(10, 10);
        Box bx = new Box(10, 10);
        System.out.println(tr.getArea());
        System.out.println(bx.getArea());
    }
}