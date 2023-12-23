package org.example;
interface Movable {
    void add(double dx, double dy);
    void sub(double dx, double dy);
}
interface Scalable {
    void mul(double s);
    void div(double s);
}
class Point implements  Movable, Scalable {
    double x, y;
    public void add(double dx, double dy) {
        x += dx;
        y += dy;
    }
    public void sub(double dx, double dy) {
        x -= dx;
        y -= dy;
    }
    public void mul(double s) {}
    public void div(double s) {}
}
public class Main {
    public static void main(String[] args) {
        Movable movable;
        Scalable scalable;
        Point point = new Point();
        movable = point;
        //movable.mul(3.0);     compile error
        scalable = point;
        //scalable.add(3.0, 3.0); compile error
        point.mul(3.0);
        point.add(3.0, 3.0);
    }
}