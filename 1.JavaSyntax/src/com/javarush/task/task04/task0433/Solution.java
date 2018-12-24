package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s = "S";
        int i=0;
        while(i<10) {
            int j=0;
            while(j<10) {
                System.out.print(s);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
