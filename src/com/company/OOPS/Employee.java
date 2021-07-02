package com.company.OOPS;

import javax.sound.sampled.Line;

class Display {
    public Display(int i) {
        System.out.println("ONE");
    }

    public Display() {
        this(1);

        System.out.println("TWO");
    }

    void Display() {
        Display(1);

        System.out.println("THREE");
    }

    void Display(int i) {
        System.out.println("FOUR");
    }
}

public class Employee {
    public static void main(String[] args) {
        /*Display obj = new Display();
        obj.Display();*/
        System.out.println(lineLength(-7,  4));
    }

    private static int lineLength(int a , int b){
        return Math.abs(a - b);
    }
}
