package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int [] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
            maximum = mas[0];
            for (int j = 1; j < mas.length; j++) {
                if (mas[j] > maximum) {
                    maximum = mas[j];
                }
            }
        }
        reader.close();
        System.out.println(maximum);
    }
}
