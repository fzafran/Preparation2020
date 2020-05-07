package com.project;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        //e.g. create a sorter with the following capabilities:
        // a) It should take an integer array
        // b) It should take a string which defines what sorter it will use.
        int[] arrayToSort = {5,4,3,2,1};
        sort(arrayToSort, SorterWrapper.Insertion_Sort);

    }



    public static void sort(int[] arrayToSort, String sorterName) {
        SorterWrapper sorter = new SorterWrapper();
        sorter.setSortingMethod(sorterName);
        int [] sorted = sorter.sort(arrayToSort);
        for(int i : sorted) {
            System.out.println("Sorted " + i);
        }

    }

}
