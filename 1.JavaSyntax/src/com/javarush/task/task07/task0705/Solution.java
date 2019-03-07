package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] bigMas = new int[20];
        int [] mas1 = new int[10];
        int [] mas2 = new int[10];

        for (int i = 0; i < bigMas.length; i++) {
            bigMas[i] = scanner.nextInt();
        }

        scanner.close();
        System.arraycopy(bigMas,0, mas1,0,10);
        System.arraycopy(bigMas,10, mas2,0,10);

        for (int i: mas2) {
            System.out.println(i);
        }

    }
}
