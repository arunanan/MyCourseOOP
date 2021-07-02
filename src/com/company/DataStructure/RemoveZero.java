package com.company.DataStructure;


import java.util.*;

public class RemoveZero {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {

        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < arr.length)
            arr[count++] = 0;



















       /* ArrayList<Integer> l = new ArrayList<>();
        for(int i =0; i < arr.length ; i++){
            l.add(arr[i]);
        }
        Integer zero = 0;
        System.out.println(l);
        while(l.contains(zero)){
            l.remove(zero);
        }
                                      // 9 0 8 0 7
        System.out.println(l);        // 9 8 7
        for(int j =0 ; j < arr.length  ; j++) {
            if (l.iterator().hasNext()) {
                arr[j] = l.iterator().next().intValue();
            }
        }*/
    }
}
