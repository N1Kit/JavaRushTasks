package com.javarush.task.task06.task0602;

/*
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable{
        //напишите тут ваш код
        System.out.println("A Cat was destroyed");
    }

    public Cat(){
        System.out.println("A Cat was created");
    }
}

class Dog {
    protected void finalize() throws Throwable{
        //напишите тут ваш код
        System.out.println("A Dog was destroyed");
    }
}
