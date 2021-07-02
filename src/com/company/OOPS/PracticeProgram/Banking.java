package com.company.OOPS.PracticeProgram;


import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    public Homeloan(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }
    abstract double getRateOfIntererst();
    abstract double simpleInterest();
}

class Bank1 extends Homeloan {
    final double rateOfinterest =7.2;
    public Bank1(double amount, int time) {
        super(amount, time);
    }

    @Override
    double getRateOfIntererst() {
        return this.rateOfinterest;
    }

    @Override
    double simpleInterest() {
        return super.amount + ((super.amount*super.time* this.rateOfinterest) / 100);
    }

    //Write your code here



}

class Bank2 extends Homeloan {
    final double rateOfinterest =8.1;

    public Bank2(double amount, int time) {
        super(amount , time);
    }

    @Override
    double getRateOfIntererst() {
        return this.rateOfinterest;
    }

    @Override
    double simpleInterest() {
            return super.amount + ((super.amount*super.time* this.rateOfinterest) / 100);
    }



}

public class Banking {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();

        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if(amount <=0 || time <=0 ){
            System.out.println("invalid input");

        }
        else if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }

}

