package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
*/

public class Solution {



    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == c & a == b) System.out.println(a+" "+b+" "+c);
        else if (a == b) System.out.println(a+" "+b);
        else if (b == c) System.out.println(b+" "+c);
        else if (a == c) System.out.println(a+" "+c);







    }
}