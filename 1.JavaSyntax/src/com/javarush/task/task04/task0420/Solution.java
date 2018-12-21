package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < nums.length-1; i++) {
            for (int j =  0; j < nums.length-i-1; j++) {
                if (nums[j] <= nums[j+1]) {
                    nums[j] = nums[j] + nums[j+1] - (nums[j+1] = nums[j]);    //  a=a+b-(b=a);
                }
            }
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }
        //System.out.println(Arrays.toString(nums));
    }
}
