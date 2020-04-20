package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
  public static void main(String[] args) throws IOException {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(Integer.parseInt(reader.readLine()));
    }
    int maxlen = 1;
    int curlen = 1;

    for (int i = 1; i < list.size(); i++) {
      if (list.get(i).equals(list.get(i - 1))) {
        curlen++;
        if (curlen > maxlen) {
          maxlen = curlen;
        }
      } else
        curlen = 1;
    }
    System.out.println(maxlen);
  }
}