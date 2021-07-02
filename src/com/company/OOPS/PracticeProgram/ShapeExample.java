package com.company.OOPS.PracticeProgram;

import java.util.*;

//Write your code here

public class ShapeExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rectanglee();
        int numberOfSides = in.nextInt();
        obj.setNumberSides(numberOfSides);
        obj.getShape(numberOfSides);

    }
}

class Shape {
    int numberSides;
    public Shape(int x){
        this.numberSides = x;
    }
    public Shape(){

    }

    public void setNumberSides(int numberSides){
        this.numberSides = numberSides;
    }

    public void getShape(int numberSides){
        if(this.numberSides == 3){
            System.out.println("The shape is a triangle");
        }
        else if (this.numberSides == 4){
            System.out.println("The shape is a triangle");
        }
        else if(this.numberSides == 0){
            System.out.println("The shape is a circle");
        }
        else {
            System.out.println("Enter a valid number of sides!");
        }
    }
}

class Triangle extends Shape{

    public Triangle() {

    }
}

class Rectanglee extends Shape{

       public Rectanglee() {

    }
}