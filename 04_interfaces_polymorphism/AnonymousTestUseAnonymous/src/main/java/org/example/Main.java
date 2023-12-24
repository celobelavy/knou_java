package org.example;
class CSuper {
    public int a = 10;
    public void method1() {
        System.out.println("super1");
    }
    public void method2() {
        System.out.println("super2");
    }
}
public class Main {
    public static void main(String[] args) {
        CSuper sub = new CSuper() {
            public int b = 20;
            public void method1() {
                System.out.println("sub1");
            }
            public void method3() {
                System.out.println("sub3");
            }
        };
        sub.method1();
        sub.method2();
        System.out.println(sub.a);
        //sub.method3();    Compile Error
        //System.out.println(sub.b)     Compile Error
    }
}