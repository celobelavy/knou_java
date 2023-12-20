package org.example;

public class Main {
    public static void main(String[] args) {
        Csub sub = new Csub();
        //sub.f1 = 40;
        sub.f2 = 50;
        //sub.f3 = 60;
        sub.f4 = 70;
        sub.setPrivate();
        sub.setPublic();
        //sub.mPrivate();
    }
}