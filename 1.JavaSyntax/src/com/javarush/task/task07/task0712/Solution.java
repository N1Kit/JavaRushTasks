package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = new String();
        String min = new String();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        reader.close();

        for (String s: strings) {
            if (strings.indexOf(s)==0){
                max = s;
                min = s;
            }
            if (max.length() < s.length())
                max = s;
            if (min.length() > s.length())
                min = s;
        }
        System.out.println(strings.indexOf(max) < strings.indexOf(min) ? max : min);
    }
}
