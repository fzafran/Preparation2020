package com.project;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10, };
        int[] b = {1, 3, 5, 9, 11};

        int[] c = new int[a.length + b.length];

        int temp = 0;

        for (int i = 0; i < (c.length); i++) {
            //if temp equal b ki lenth
            if (temp == b.length) {

                c[i] = a[i - temp];
            } else if (((i - temp) < (a.length)) && (a[i - temp] < b[temp])) {
                c[i] = a[i - temp];
            } else {
                c[i] = b[temp];
                temp++;
            }
        }

        for (int i : c) {
            System.out.print(i + ", ");
        }


    }


}