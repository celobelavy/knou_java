package org.example;
class Myclass {
    public static int nStaticField = 0;
}
public class Main {
    public static void main(String[] args) {
        Myclass.nStaticField = 10;
        System.out.println(Myclass.nStaticField);
    }
}