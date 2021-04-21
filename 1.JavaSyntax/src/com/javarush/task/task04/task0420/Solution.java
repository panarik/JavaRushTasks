package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) max = arr[i];
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min) min = arr[i];
        }



//        if (a>b && b>c) System.out.println(a+" "+b+" "+c); //ABC
//        if (a>c && c>b) System.out.println(a+" "+c+" "+b); //ACB
//        if (b>a && a>c) System.out.println(b+" "+a+" "+c); //BAC
//        if (b>c && c>a) System.out.println(b+" "+c+" "+a); //BCA
//        if (c>a && a>b) System.out.println(c+" "+a+" "+b); //CAB
//        if (c>b && b>a) System.out.println(c+" "+b+" "+a); //CBA







    }
}
