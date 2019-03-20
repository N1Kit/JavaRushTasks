package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        System.out.println("qqqq");
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        System.out.println("rrrrr");
        for (int j = 0; j < m; j++) {
            list.add(list.get(j));
            j++;
            list.remove(j);
            j--;
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}
