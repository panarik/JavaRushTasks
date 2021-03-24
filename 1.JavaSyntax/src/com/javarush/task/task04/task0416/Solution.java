package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
//        double t = scanner.nextDouble();
//        for (int i=0; i<60; i=i+5) {
//            if(t>=i && t<i+3) System.out.println("зелёный");
//            else if(t>=i && t>=i+3 && t<i+4) System.out.println("жёлтый");
//            else if(t>=i && t>=i+4 && t<i+5) System.out.println("красный");

        double time = scanner.nextDouble();

        if (time % 5 >= 0 && time % 5 < 3) {
            System.out.println("зелёный");
        } else if (time % 5 < 4 && time % 5 >= 3) {
            System.out.println("жёлтый");
        } else if (time % 5 < 5 && time % 5 >= 4) {
            System.out.println("красный");

        }


    }
}