package org.example;

public class Main {
    public static void main(String[] args) {
        Thread thd = new Thread(() -> {
            System.out.println("my thread");
        });
        thd.start();
    }
}