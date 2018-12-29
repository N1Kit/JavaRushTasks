package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int[] ar = new int[3];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }

        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j < ar.length; j++) {
                if(i!=j){
                    if (ar[i] == ar[j]) {
                        System.out.println(ar[i]);
                    }
                }
            }
        }


//        if (ar[0] == ar[1] || ar[1] == ar[2]) {
//            System.out.println(ar[2]);
//        }
//        if (ar[0] == ar[1] || ar[0] == ar[2]) {
//            System.out.println(ar[0]);
//        } else {
//            System.out.println((ar[0] + ar[1] + ar[2]) / ar.length);
//        }

    }
}
