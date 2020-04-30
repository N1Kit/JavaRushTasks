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

    //напишите тут ваш код
    String delim = " ";
    String string2 = "";
    while (string.contains("  ")) {
      string = string.replace("  ", " ").trim();
    }

    String[] words = string.split(delim);
    for (String s : words) {

      s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
      string2 += s + delim;
    }
    System.out.println(string2);
  }
}
