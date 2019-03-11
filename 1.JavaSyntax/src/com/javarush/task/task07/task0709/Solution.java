package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    ArrayList<String> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String theShortestLine = new String();

    for (int i = 0; i < 5; i++) {
      list.add(reader.readLine());
    }

    reader.close();

    for (String st : list) {
      if (list.indexOf(st) == 0) {
        theShortestLine = st;
      }
      if (st.length() < theShortestLine.length())
        theShortestLine = st;
    }

    for (String s : list) {
      if (s.length() == theShortestLine.length())
        System.out.println(s);
    }
  }
}
