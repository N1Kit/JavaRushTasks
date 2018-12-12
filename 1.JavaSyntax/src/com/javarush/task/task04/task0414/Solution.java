package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        int days = 365;
        if (year%400==0){
            days++;
        }
        if (year%100==0){
            days--;
        }
        if (year%4==0){
            days++;
        }

        System.out.println("количество дней в году: " + days);
    }
}