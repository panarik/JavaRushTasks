package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 1, 25, 500);
        Cat cat2 = new Cat("Барсик2", 10, 250, 5000);
        Cat cat3 = new Cat("Барсик3", 15, 2500, 50000);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}