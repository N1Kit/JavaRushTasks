package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] strMass = new String[10];
        int [] intMass = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strMass[i] = reader.readLine();
            intMass[i] = strMass[i].length();
        }
        reader.close();
        for (int i: intMass) {
            System.out.println(i);
        }
    }
}
