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
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.weight = 2;
        cat1.strength = 2;

        Cat cat2 = new Cat();
        cat2.age = 1;
        cat2.weight = 2;
        cat2.strength = 2;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
