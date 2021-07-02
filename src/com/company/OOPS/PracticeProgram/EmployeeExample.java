package com.company.OOPS.PracticeProgram;


class Employee1 {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    public Employee1(int empId, String empFirstName, String empSecondName, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;
    }

    public void printDetails(){
        System.out.println("employee full name " + this.empFirstName + " " + this.empSecondName + "\n" +
                "employee annual package " + getannualSalary());
    }

    public double getannualSalary() {
        return (12 * this.empSalary);
    }
    //Write your code here

}

public class EmployeeExample {
    public static void main(String[] args) {

        Employee1 e1 = new Employee1(101512031, "Sushil", "Kumar", 45000.58);
        Employee1 e2 = new Employee1(101512032, "Tara", "Sharma",51000.99);
        e1.printDetails();
        e2.printDetails();
    }
}