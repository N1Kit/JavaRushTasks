package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int one = Integer.parseInt(sc.nextLine());
        int two = Integer.parseInt(sc.nextLine());
        int three = Integer.parseInt(sc.nextLine());

//        int[] mas = {one, two, three};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = i + 1; j < mas.length - 1; j++) {
                if (one == two) {
                    if ( one == three) {
                        System.out.println(one + " " + two + " " + three);
                    } else
                        System.out.println(one + " " + two);
                } else if (one == three) {
                    System.out.println(one + " " + three);
                } else if (two == three) {
                    System.out.println(two + " " + three);
                }
//            }
//        }
    }
}
