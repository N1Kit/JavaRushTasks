package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        String pn = num < 0 ? "отрицательное" : "положительное";
        String ch = num % 2 == 0 ? "четное" : "нечетное";

        if (num == 0)
            System.out.println("ноль");
        else
            System.out.println(pn + " " + ch + " число");
    }
}
