package org.example;
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
        Supplier <Integer> rand = () -> {
            Integer r = (int)(Math.random() * 100);
            return r;
        };
        int a = rand.get();
        System.out.println(a);
    }
}