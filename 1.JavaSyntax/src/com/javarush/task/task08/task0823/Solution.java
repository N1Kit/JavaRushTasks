package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String string2 = "";
        //напишите тут ваш код
       String[] words = string.split("\\s");
      for ( String s: words) {
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        string2 = string2 + s + " ";
      }
       System.out.println(string2);
    }
}
