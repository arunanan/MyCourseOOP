package com.company.DataStructure;


import java.util.ArrayList;                  //ArrayList library imported
import java.util.Collections;

class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> random = new ArrayList<>();
        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);


        //   int random[ ] = {2, 4, 5, 10};
        //Declare and create an object of the ArrayList class named 'random', in place of the line above

        //Add the first four elements to this 'random' ArrayList

        random.add(new Integer(99));                    //Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList<Integer> arr) {
        Collections.reverse(arr);
        //Change the type of the parameter to ArrayList
        for (Integer a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
            System.out.println(a);
        }
    }
}