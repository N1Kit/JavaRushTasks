package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.height = this.width = 0;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.height = this.width = width;
    }

    public Rectangle(Rectangle rectangle){
//        this.top = rectangle.top;
//        this.left = rectangle.left;
//        this.width = rectangle.width;
//        this.height = rectangle.height;
        this(rectangle.top, rectangle.left, rectangle.width, rectangle.height); // более компактный способ вызвать конструктор внутри этого конструктора
    }

    public static void main(String[] args) {

    }
}
