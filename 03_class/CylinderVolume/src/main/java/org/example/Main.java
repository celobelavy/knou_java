package org.example;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        int h = 8;
        Cylinder cy = new Cylinder(c, h);
        System.out.println(cy.getVolume());
    }
}