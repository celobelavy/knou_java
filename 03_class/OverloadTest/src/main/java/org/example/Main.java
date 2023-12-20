package org.example;
class MyClass {
    public int add(int a, int b) {return a + b;}
    public double add(double a, double b) {return a + b;}
}
public class Main {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println(mc.add(10, 15));
        System.out.println(mc.add(10.5, 15.3));
        System.out.println(mc.add(10, 10.5));
    }
}