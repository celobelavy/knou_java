package org.example;
class MyClass {
    public static int nStaticField1 = 10;
    public static int nStaticField2;
    public MyClass() {nStaticField2 = 20;}
}
public class Main {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        System.out.println("mc1 is constructed.");
        System.out.println("nStaticField1 : " + mc1.nStaticField1);
        System.out.println("nStaticField2 : " + mc1.nStaticField2);
        // mc1.nStaticField1 이지만 nStaticField1 은 클래스 맴버이기 때문에 Myclass.nStaticField1 으로 쓰는게 더 정확함
        MyClass.nStaticField1 += 10;
        MyClass.nStaticField2 += 20;
        System.out.println("Values are changed");
        System.out.println("nStaticField1 : " + mc1.nStaticField1);
        System.out.println("nStaticField2 : " + mc1.nStaticField2);
        MyClass mc2 = new MyClass();
        System.out.println("mc2 is consturcted");
        System.out.println("nStaticField1 : " + mc1.nStaticField1);
        System.out.println("nStaticField2 : " + mc2.nStaticField2);
    }
}