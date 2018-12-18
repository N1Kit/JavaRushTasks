package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        // или
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
