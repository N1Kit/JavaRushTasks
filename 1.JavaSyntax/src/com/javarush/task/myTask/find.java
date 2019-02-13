package com.javarush.task.myTask;

/**
 * Поиск одинаковых строк в двух массивах
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class find {
    public static void main(String[] args) {
        int [][] arr1 = new int [10][10];
        int [][] arr2 = new int [10][10];

        for (int i = 1; i < arr1.length; i++) { //создание и вывод 1-го массива на экран
            for (int j = 1; j < arr1.length; j++) {
                arr1[i][j] = i*j;
            //    System.out.printf("%3s", arr1[i][j]);
            }
        //    System.out.println();
        }
        System.out.println();

        for (int i = 1; i < arr1.length; i++) { //создание и вывод 2-го массива на экран
            for (int j = 1; j < arr1.length; j++) {
                arr2[i][j] = j*2;
            //    System.out.printf("%3s", arr2[i][j]);
            }
        //    System.out.println();
        }

        for (int i = 1; i < arr1.length; i++) { //создание и вывод массива на экран
            for (int j = 1; j < arr1.length; j++) {
                arr1[i][j] = i*j;
                System.out.printf("%3s", arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
