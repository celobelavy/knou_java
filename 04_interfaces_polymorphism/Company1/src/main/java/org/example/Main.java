package org.example;
class Employee {
    int nSalary;
    String szDept = null;
    public void doJob() {
        System.out.println("Do something");
    }
}
class Sales extends Employee {
    public Sales() {
        szDept = "Sales Dept";
    }
    public void doJob() {
        System.out.println("Do sales");
    }
}
class Development extends Employee {
    public Development() {
        szDept = "Devlopment Dept";
    }
    public void doJob() {
        System.out.println("Do development");
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1, emp2;
        emp1 = new Sales();
        emp2 = new Development();
        emp1.doJob();
        emp2.doJob();

        Sales employee1 = new Sales();
        Development employee2 = new Development();
        employee1.doJob();
        employee2.doJob();
    }
}