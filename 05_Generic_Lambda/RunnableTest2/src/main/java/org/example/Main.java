package org.example;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("my thread");
            }
        };

        Thread thd = new Thread(runnable);
        thd.start();
    }
}