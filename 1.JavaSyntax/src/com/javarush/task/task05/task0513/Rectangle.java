package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
        System.out.println(this.top + " " + this.left + " " + this.width + " " + this.height);
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
        System.out.println(this.top + " " + this.left + " " + this.width + " " + this.height);
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
        System.out.println(this.top + " " + this.left + " " + this.width + " " + this.height);
    }

    public void initialize(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
        System.out.println(this.top + " " + this.left + " " + this.width + " " + this.height);
    }

    public static void main(String[] args) {
/*
        Rectangle rectangle1 = new Rectangle();
        rectangle1.initialize(10,10,15, 20);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.initialize(11, 11, 20);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.initialize(12,12);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.initialize(rectangle1);
        */
    }
}
