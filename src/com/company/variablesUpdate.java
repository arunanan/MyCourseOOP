package com.company;

public class variablesUpdate {
    public static void main(String[] args)
    {
        // declaring and initialization of variables in one line
        int distanceAdam = 0, distanceLucy = 0;

        // printing out initial values of these variables
        System.out.println(distanceAdam);
        System.out.println(distanceLucy);

        // updating these variables
        distanceAdam = distanceAdam + 20;

        // another way to update by overwriting
        distanceLucy = 15;

        // printing out final updated values

        System.out.println(distanceAdam);
        System.out.println(distanceLucy);

        int num =23456;

        int tent = (num % 100000)/10000;
        System.out.println(tent);

        int th = (num%10000) /1000;
        System.out.println(th);

        int hh = (num%1000) /100;
        System.out.println(hh);

        int ten = (num%100) /10;
        System.out.println(ten);

        int zero = (num%10) /1;
        System.out.println(zero);
        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("'%15s' %n", "baeldung");

    }
}
