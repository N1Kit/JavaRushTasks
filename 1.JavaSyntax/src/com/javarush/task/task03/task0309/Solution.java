package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [] numbers = new int[10];
        int sum = 0;
        for (int i=0; i<5; i++){
            numbers[i] = i+1;
            sum = numbers[i] + sum;
            System.out.println(sum);
        }
    }
}
