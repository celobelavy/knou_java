package org.example;
import java.util.Scanner;
class Electronics {
    private int nVoltage = 0;

    public void turnOn(int nInputVoltage) {
        nVoltage = nInputVoltage;
    }

    public void turnOff() {
        nVoltage = 0;
    };
    public boolean checkVoltage(int volt) {
        nVoltage = volt;
        if (nVoltage>0) {
            turnOn(nVoltage);
            return true;
        }
        else {
            turnOff();
            return false;
        }

    }
}
public class Main {
    public static void main(String[] args) {
        boolean turnStatus;
        Scanner sc = new Scanner(System.in);
        Electronics ec = new Electronics();
        int enterVolt = sc.nextInt();
        turnStatus = ec.checkVoltage(enterVolt);
        System.out.println("Now Turn Status " + turnStatus);
    }
}