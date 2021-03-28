package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] arr = new int[4];

        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(max);

    }
}
