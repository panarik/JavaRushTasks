package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String days = bufferedReader.readLine();
        int daysInt = Integer.parseInt(days) ;

        if (daysInt == 1) System.out.println("понедельник");
        else if (daysInt == 2) System.out.println("вторник");
        else if (daysInt == 3) System.out.println("среда");
        else if (daysInt == 4) System.out.println("четверг");
        else if (daysInt == 5) System.out.println("пятница");
        else if (daysInt == 6) System.out.println("суббота");
        else if (daysInt == 7) System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");

    }
}