package org.example;

class Myclass {
    public static int nStaticField = 0; // static 으로 선언하면 데이터를 공유함
}
public class Main {
    public static void main(String[] args) {
        Myclass myObject1, myObject2;
        myObject1 = new Myclass();
        myObject2 = new Myclass();

        myObject1.nStaticField = 10;
        System.out.println(myObject2.nStaticField);
        myObject2.nStaticField += 10;
        System.out.println(myObject1.nStaticField);
    }
}