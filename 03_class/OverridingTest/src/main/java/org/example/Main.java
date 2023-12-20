package org.example;
class Shape {
    public double getArea(double h, double w) {return h * w;}
}
class Triangle extends Shape {
    public double getArea(double h, double w) {return h * w * 0.5;}
}
public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Shape a = new Shape();
        System.out.println(t.getArea(3.0, 4.0));
        // Shape 클래스의 getArea는 쉐도잉이 되어 부를 수가 없음, 메소드이름이 같으므로
        System.out.println(a.getArea(3.0, 4.0));
    }
}