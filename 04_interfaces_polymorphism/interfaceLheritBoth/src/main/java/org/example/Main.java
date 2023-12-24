package org.example;
interface Calculator {
    public void calculate(String order);
}

class Computer {
    int nMemoryCapacity;
    int nHDDCapacity;
    boolean qPowered = false;
    void powerOn() {
        qPowered = true;
    }
    void powerOff() {
        qPowered = false;
    }
}

class PersonalComputer extends Computer implements Calculator {
    public void calculate(String order) {
        System.out.println("PersonalComputer : " + order);
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}