package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] houses = new int[15];
        int oddCount = 0;
        int evenCount = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < houses.length; i++) {
            houses[i] = sc.nextInt();
            if(i == 0 || i%2 == 0 )
                evenCount+=houses[i];
            else
                oddCount+=houses[i];
        }
        sc.close();

        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
