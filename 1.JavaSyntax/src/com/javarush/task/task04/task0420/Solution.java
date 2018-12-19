package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
           nums[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]<=nums[i]){
                nums[i-1]=nums[i-1]+nums[i]-(nums[i]=nums[i-1]);    //  a=a+b-(b=a);
            }
        }
            System.out.println(Arrays.toString(nums));
    }
}
