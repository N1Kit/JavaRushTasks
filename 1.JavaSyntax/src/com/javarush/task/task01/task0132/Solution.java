package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int hundred, decimal, units;
        hundred = number / 100;
        decimal = number % 100 /10;
        units = number % 10;
        return (hundred + decimal + units);
    }
}