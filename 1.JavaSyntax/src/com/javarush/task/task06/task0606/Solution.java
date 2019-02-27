package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int n = String.valueOf(number).length();

        int ed, dec, dec1, sot, tys, dtys, stys;
        ed = number%2;
        dec = number/10%2;
        dec1 = number/10%2;
        sot = number/100%2;
        tys = number/1000%2;
        dtys = number/10000%2;
        stys = number/100000%2;
        int stys1 = (int)((double)number * 0.00001);
        //double tys1 = number % Math.pow(10, 4) / Math.pow(10, 3) % 2;
        //dtys = number%100000/10000%2;
//        System.out.println(n);
//        System.out.println();

        int ten =1;
        for (int i = 0; i < n; i++) {
            ten *= 10;
            if (((number / ten) % 2) == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
