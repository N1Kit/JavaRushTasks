package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    public String name = null;
    public int age;
    public int weight;
    public String address = null;
    public String color = null;

    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.weight = 4;
        this.color = "grey";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public void initialize(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.age = 3;
        this.color = "white";
    }

    public void initialize(int weight, String color){
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
