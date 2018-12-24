package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String discr;
        if (num > 0 && num <1000){
            discr = num % 2 == 0 ? "четное": "нечетное";
            if (num < 10) {
                discr += " однозначное";
            }
            else if (num > 9 && num < 100){
                discr += " двузначное";
            }
            else discr += " трехзначное";
            System.out.println(discr + " число");
        }
    }
}
