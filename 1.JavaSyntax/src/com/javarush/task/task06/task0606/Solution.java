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

        int ten =1;
        for (int i = 0; i < n; i++) {
            if (((number / ten) % 2) == 0) {
                even++;
            } else {
                odd++;
            }
            ten *= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
