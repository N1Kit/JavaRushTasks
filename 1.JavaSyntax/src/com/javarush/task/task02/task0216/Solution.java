package com.javarush.task.task02.task0216;

/* 
Минимум трёх чисел
*/
public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int min;
        int num1 = a;
        int num2 = b;
        int num3 = c;
        if (num1 <= num2 && num1 <= num3)
            min = num1;
        else
            if (num2 <= num1 && num2 <= num3)
                min = num2;
            else
                min = num3;

        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}