package com.javarush.task.task04.task0418;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a<b) System.out.println(a);
        else if (b<a) System.out.println(b);
        else System.out.println(a);

    }
}