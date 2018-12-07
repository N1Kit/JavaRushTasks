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
            int i = 0;              //a=a+b; b=a-b; a=a-b; => a=a+b-(b=a)

            buf = newSent[i];
            newSent[i] = newSent[i+1];
            newSent[i+1] = buf;
            System.out.print(newSent[i]+newSent[i+1]+newSent[i+2]);
            System.out.println();
            buf = newSent[i];
            newSent[i] = newSent[i+2];
            newSent[i+2] = buf;
            System.out.print(newSent[i]+newSent[i+1]+newSent[i+2]);
            System.out.println();
/*            buf = newSent[i];
            newSent[i] = newSent[i+1];
            newSent[i+1] = newSent[i+2];
            newSent[i+2] = buf;
            System.out.print(newSent[i]+newSent[i+1]+newSent[i+2]);
            System.out.println();
            for (int j=0; j<1; j++){
                buf = newSent[j+1];
                newSent[j+1] = newSent[j+2];
                newSent[j+2]=buf;
                System.out.print(newSent[j]+newSent[j+1]+newSent[j+2]);
                System.out.println();
            }*/

//            System.out.print(newSent[i]+newSent[i+1]+newSent[i+2]);
//            System.out.println();

            i++;
        }
        while(!Arrays.equals(sentOrig,newSent));
   }
}
