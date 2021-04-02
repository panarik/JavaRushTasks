package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int negative = 0;
        int positive = 0;

        Scanner scanner = new Scanner(System.in);

        //первое число
        int a = scanner.nextInt();
        if (a > 0) positive++;
        if (a < 0) negative++;


        //второе число
        int b = scanner.nextInt();
        if (b > 0) positive++;
        if (b < 0) negative++;

        //Третье число
        int c = scanner.nextInt();
        if (c > 0) positive++;
        if (c < 0) negative++;

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);


    }
}
