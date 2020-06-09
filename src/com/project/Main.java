package com.project;


import java.util.Scanner;

public class Main {




   // private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        char[] array = s.toCharArray();

        int count = 0;

        String even = "e";
        String odd = "0";
        for (char ch : array) {


            if (count % 2 == 0) {
                even = even + ch;
            } else {
                odd = odd + ch;
            }
            count++;
        }
        count = 0;

        System.out.println(even + " " + odd);
    }
}

          //  String str = "MaybNcadmeefigshainjukml";
//            char ch1 = str.charAt(0);
//
//            char ch2 = str.charAt(1);
//
//            char ch3 = str.charAt(2);
//
//            char ch4 = str.charAt(3);
//
//            char ch5 = str.charAt(4);
//
//            char ch6= str.charAt(5);
//
//            char ch7 = str.charAt(6);
//
//            char ch8 = str.charAt(7);
//            char ch9 = str.charAt(8);
//
//            char ch10 = str.charAt(9);
//
//            char ch11 = str.charAt(10);
//
//            char ch12 = str.charAt(11);
//            char ch13 = str.charAt(12);
//
//            char ch14 = str.charAt(13);
//
//            char ch15 = str.charAt(14);
//
//            char ch16 = str.charAt(15);
//            char ch17 = str.charAt(16);
//
//            char ch18 = str.charAt(17);
//
//            char ch19 = str.charAt(18);
//            char ch20 = str.charAt(19);
//
//
//            char ch21 = str.charAt(20);
//
//            char ch22 = str.charAt(22);
//
//            char ch23 = str.charAt(22);
//
//            char ch24 = str.charAt(23);
//
//            System.out.println("Char position : " + ch1 + ch3);
//            System.out.println("Character position: " + ch2 + ch4);
//            System.out.println("Character position " + ch5+ ch7);
//            System.out.println("Character position: " + ch6 + ch8);
//            System.out.println("Character position: " + ch9 + ch11);
//            System.out.println("Character position: " + ch10 + ch12);
//            System.out.println("Character position: " + ch13 + ch15);
//            System.out.println("Character position: " + ch14 + ch16);
//            System.out.println("Character position: " + ch17 + ch19);
//            System.out.println("Character position: " + ch18 + ch20);
//            System.out.println("Character position: " + ch21 + ch23);
//            System.out.println("Character position: " + ch22+ ch24);
//
//
//
//
//        }
//    }




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

        //{
//            int n = 0;
//            Scanner s = new Scanner(System.in);
//            System.out.print("Enter no. of elements you want in array:");
//            n = s.nextInt();
//            int a[] = new int[n];
//            System.out.println("First value entered by User :");
//
//            a[n] = s.nextInt();
//
//            System.out.println(" Second value entered by User:");
//            n = s.nextInt();
//
//
//
//            System.out.println(" Third value entered by User  :");
//            n = s.nextInt();
//
//            System.out.println("Forth value entered by User  :");
//            n = s.nextInt();
//
//            System.out.println(" Fifth value entered by User  :");
//            n = s.nextInt();
//
//            System.out.println(" six value entered by User:");
//            n = s.nextInt();
//
//            System.out.println(" Seven value entered by User :");
//            n = s.nextInt();
//
//            System.out.println(" Eight value entered by User  :");
//            n = s.nextInt();
//
//            System.out.println(" Nine value entered by User :");
//            n = s.nextInt();
//
//            System.out.println(" Tenth value entered by User:");
//            for (int i = 0; i < n; i++) {
//                System.out.println(a[i]);
//            }

//            Scanner s = new Scanner(System.in);
//            System.out.println("input number you want to enter? ");
//            int n = s.nextInt();
//            int userNumberArray[] = new int[n];
//            for(int i=0; i<n; i++) {
//                System.out.println("enter value for " + i);
//                userNumberArray[i] = s.nextInt();
//            }
//
//            for(int j = 0; j < userNumberArray.length; j++) {
//                System.out.println("User entered value :" + userNumberArray[j] + "\n");
//            }
//
//        }
//    }
//}
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
