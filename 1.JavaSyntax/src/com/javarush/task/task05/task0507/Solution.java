package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double sum = 0;
        double i = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == -1)
                break;
            else {
                sum += number;
                i++;
            }
        }scanner.close();
        System.out.println(sum/i);
    }
}

