package org.example;

public class Cylinder {
    // 밑면
    private Circle c;
    // 높이
    private  int h ;
    public Cylinder(Circle a, int b) {
        c = a;
        h = b;
    }
    public double getVolume() {
        return c.getArea() * h;
    }
}
