package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
            return;
        }
        if (name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }

    }
}
