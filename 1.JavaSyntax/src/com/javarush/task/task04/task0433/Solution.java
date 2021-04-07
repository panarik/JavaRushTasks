package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {

    private static char s;
    private static int i;
    private static int j;

    public static void main(String[] args) {

        s = 'S';
        i = 0;
        j = 0;


        while (i<10) {
            while (j<10) {
                System.out.print(s);
                j++;
            }
            System.out.println("");
            i++;
            j=0;
        }


    }
}
