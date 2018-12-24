package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int neg = 0, pos = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) neg++;
            if (nums[i] > 0) pos++;
        }
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);

    }
}
