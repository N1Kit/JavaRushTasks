package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [] numbers = new int[10];
        int comp=1;
        for (int i=0; i < 10; i++){
            numbers[i]=i+1;
            comp = comp * numbers[i];
        }
        System.out.println(comp);
    }
}
