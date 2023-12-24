package org.example;
interface Computer {
    public void calculate(String order);
}
class PersonalComputer implements Computer {
    public void calculate(String order) {
        System.out.println("PersonalComputer : " + order);
    }
}
class Workstation implements Computer {
    public void calculate(String order) {
        System.out.println("Workstation : " + order);
    }
}
public class Main {
    public static void main(String[] args) {
        Computer b, c;
        b = new PersonalComputer();
        c = new Workstation();
        b.calculate("Personal");
        b.calculate("Works");
    }
}