package org.example;
class CSuper {
    public double x;
}
class Csub extends CSuper {
    public double x;
    public Csub(double new_x) {
        this.x = new_x;
        super.x = new_x * 10;
    }
    public double getSuepr() {
        return super.x;
    }
    public double getSub() {
        return this.x;
    }
}
public class Main {
    public static void main(String[] args) {
        Csub sub = new Csub(10.0);
        System.out.println(sub.x);
        System.out.println(sub.getSuepr());
        System.out.println(sub.getSub());
    }
}