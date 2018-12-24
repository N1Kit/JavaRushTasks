package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] nums = new int[3];
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
