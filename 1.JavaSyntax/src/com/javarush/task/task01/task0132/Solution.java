package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int sum = 0;
        String s = "" + number;

        char c1 = s.charAt(s.length() - 3);
        char c2 = s.charAt(s.length() - 2);
        char c3 = s.charAt(s.length() - 1);

        String s1 = "" + c1;
        String s2 = "" + c2;
        String s3 = "" + c3;

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);

        sum = i1+i2+i3;

        return sum;
    }
}