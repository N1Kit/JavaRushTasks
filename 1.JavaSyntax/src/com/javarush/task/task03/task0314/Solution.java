package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [][] tab = new int [11][11];
        int [] test = new int[10];

        for (int i=1; i < tab.length; i++){
            for (int j=1; j < tab.length; j++){
                tab [i][j] = i * j;
                System.out.print(" ");

                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        for (int z=0; z<test.length; z++){
            test[z]=z;
        }
    }
}
