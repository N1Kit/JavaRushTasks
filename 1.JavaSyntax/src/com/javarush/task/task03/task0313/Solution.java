package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String [] sentOrig = {"Мама", "Мыла", "Раму"};
        String [] newSent = new String[3];
        System.arraycopy(sentOrig,0,newSent,0,3);
        String buf;

        do {
            int i = 0;

            buf = newSent[i];
            newSent[i] = newSent[i+1];
            newSent[i+1] = newSent[i+2];
            newSent[i+2] = buf;
            System.out.print(newSent[i]+newSent[i+1]+newSent[i+2]);
            System.out.println();

            i++;
        }
        while(!Arrays.equals(sentOrig,newSent));
   }
}
