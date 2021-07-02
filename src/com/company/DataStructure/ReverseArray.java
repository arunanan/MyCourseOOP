package com.company.DataStructure;


import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {  //123456
        int right = 0;
        int left = arr.length -1;

        for (int i = 0 ; i< arr.length/2 ;i++){   //5 4 3 2 1
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            right++; left--;
        }


        // Write your code here
    }
}