package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    ArrayList<String> list = new ArrayList<>();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 5; i++) {
      String st = reader.readLine();
      list.add(st);
    }

    for (int i = 0; i < 13; i++) {
      String buf = list.get(4);
      list.remove(4);
      list.add(0, buf);
    }

    for (String s : list) {
      System.out.println(s);
    }
  }
}
