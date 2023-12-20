package org.example;
class CSuper {
    public CSuper() {
        System.out.println("super non-argu");
    }
    public CSuper(int a) {
        System.out.println("super argu");
        // 실행되지 않음
    }
}

class CSub extends CSuper {
    public CSub() {
        System.out.println("sub non-argu");
    }
    public CSub(int a) {
        System.out.println("sub argu");
    }
}
public class Main {
    public static void main(String[] args) {
        CSub sub1 = new CSub();
        CSub sub2 = new CSub(10);
    }
}