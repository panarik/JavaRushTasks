package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {

        int a = 8;
        int jMax = 1;

        for (int i = 0; i<10; i++) {
            for (int j = 0; j<jMax; j++) {
                System.out.print(8);
            }
            jMax++;
            System.out.println();
        }


    }
}
