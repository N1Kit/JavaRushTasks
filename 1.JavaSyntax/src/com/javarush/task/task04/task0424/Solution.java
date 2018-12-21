package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[3];
        for (int i = 1; i < nums.length ; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] == nums[j + 1] && nums[j] != nums[j + 2]) {
                    System.out.println(j);
                } else if (nums[j+1]==nums[j+2])System.out.println(j);
                else System.out.println(j);
            }
        }
    }
}
