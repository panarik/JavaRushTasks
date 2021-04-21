package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];

        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        int positive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) positive++;
        }

        System.out.println(positive);

    }
}
