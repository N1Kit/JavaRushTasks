package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] mas = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = mas.length-1; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }
}

