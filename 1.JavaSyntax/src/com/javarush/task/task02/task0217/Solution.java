package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int mainMin;
        int minAB = min(a, b);
        int num3 = c;
        int num4 = d;

        if (minAB <= c && minAB <= d)
            mainMin = minAB;
        else
            if (c <= minAB && c <= d)
                mainMin = c;
            else
                mainMin = d;

        return mainMin;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int num1 = a;
        int num2 = b;
        int min;

        if (num1 <= num2)
            min = num1;
        else
            min = num2;
        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}