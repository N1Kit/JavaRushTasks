package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int res = 0, sum = 0;
        int[] ar = new int[3];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        scanner.close();
        /*Arrays.sort(ar); // слишком просто
        System.out.println(ar[1]);*/
        for (int i = 0; i < ar.length; i++) { // не правильно понял задание, пытался вывести среднее арифметическое
            for (int j = 0; j <= i; j++) {
                if (ar[i] == ar[j]) {
                    res = ar[i];
                }
                else {
                    res = sum - Math.min(ar[i],Math.min(ar[j],ar[j+1]));
                }
            }
        }
        System.out.println(res);
    }
}
