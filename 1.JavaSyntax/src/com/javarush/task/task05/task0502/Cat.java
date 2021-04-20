package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int myCatScore = 0;
        int anotherCatScore = 0;

        //проверка возраста
        if (this.age > anotherCat.age) myCatScore++;
        if (this.age < anotherCat.age) anotherCatScore++;

        //проверка веса
        if (this.weight > anotherCat.weight) myCatScore++;
        if (this.weight < anotherCat.weight) anotherCatScore++;

        //проверка силы
        if (this.strength > anotherCat.strength) myCatScore++;
        if (this.strength < anotherCat.strength) anotherCatScore++;

        //проверка счета
        return myCatScore > anotherCatScore;
    }

    public static void main(String[] args) {

        Cat myCat = new Cat();
        Cat anotherCat = new Cat();

        myCat.age = 2;
        myCat.weight = 10;
        myCat.strength = 1;

        anotherCat.age = 1;
        anotherCat.weight = 10;
        anotherCat.strength = 1;

        System.out.println(myCat.fight(anotherCat));

    }
}
