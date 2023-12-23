package org.example;
class Electoronics {
    private int nVoltage = 0;
    public void turnOn(int nInputVoltage) {
        nVoltage = nInputVoltage;
    }
    public void turnOff() {
        nVoltage = 0;
    }
    public int getVoltage() {
        return nVoltage;
    }
}

class TV extends Electoronics {
    private int nSize = 0;
    public void setSize(int new_size) {
        nSize = new_size;
    }
    public int getSize() {
        return nSize;
    }
}
public class Main {
    public static void main(String[] args) {
        Electoronics elec;
        TV tv = new TV();
        elec = tv;
        //elec.getSize(); compile error getSize is TV method
        tv.getSize();
    }
}
