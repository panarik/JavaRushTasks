package com.javarush.task.task04.task0406;

/* 
Программа учета имен
*/

public class Cat {
    private static String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        Cat.fullName = fullName;


    }

    public static void main(String[] args) {

    }
}
