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
        //напишите тут ваш код
        int powerCat1 = this.weight * this.strength / this.age;
        int powerAnotherCat = anotherCat.weight * anotherCat.strength / anotherCat.age;
        if (powerCat1 > powerAnotherCat)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
