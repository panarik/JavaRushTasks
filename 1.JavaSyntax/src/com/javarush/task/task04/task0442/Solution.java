package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int a = scanner.nextInt();
            sum += a;
            if (a == -1) break;
        }
        System.out.println(sum);

        int e = new int[4][8].length;
        System.out.println(e);

        System.out.println((2+2)+" = value");


    }
}
