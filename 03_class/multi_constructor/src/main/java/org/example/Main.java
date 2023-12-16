package org.example;

class TV {
    private int nSize = 0;
    public TV(int nNewSize) {
        nSize = nNewSize;
        System.out.println("Construct normal " + nSize);
    }
    public TV() {
        nSize = 20;
        System.out.println("Consturct default " + nSize);
    }
}

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV(10);
        TV tv2 = new TV();
    }
}