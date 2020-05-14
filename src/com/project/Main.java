package com.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//


        // write your code here
//        System.out.println("Hello World");
//
//        //e.g. create a sorter with the following capabilities:
//        // a) It should take an integer array
//        // b) It should take a string which defines what sorter it will use.
//        int[] arrayToSort = {5,4,3,2,1};
//        sort(arrayToSort, SorterWrapper.Insertion_Sort);
//
//    }

        {
            int n = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            n = s.nextInt();
            int a[] = new int[n];
            System.out.println("First value entered by User :");

            n = s.nextInt();

            System.out.println(" Second value entered by User:");
            n = s.nextInt();



            System.out.println(" Third value entered by User  :");
            n = s.nextInt();

            System.out.println("Forth value entered by User  :");
            n = s.nextInt();

            System.out.println(" Fifth value entered by User  :");
            n = s.nextInt();

            System.out.println(" six value entered by User:");
            n = s.nextInt();

            System.out.println(" Seven value entered by User :");
            n = s.nextInt();

            System.out.println(" Eight value entered by User  :");
            n = s.nextInt();

            System.out.println(" Nine value entered by User :");
            n = s.nextInt();

            System.out.println(" Tenth value entered by User:");
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
        }
    }
}
//
//
//
//    public static void sort(int[] arrayToSort, String sorterName) {
//        SorterWrapper sorter = new SorterWrapper();
//        sorter.setSortingMethod(sorterName);
//        int [] sorted = sorter.sort(arrayToSort);
//        for(int i : sorted) {
//            System.out.println("Sorted " + i);
//        }

    //}

//}
