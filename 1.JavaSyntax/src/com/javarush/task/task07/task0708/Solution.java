package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int maxInt;
        String maxStr = "";
        strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String s = scanner.next();
            strings.add(s);

        }

        for (int i = 0;  i < strings.size(); i++) {
            maxStr = strings.get(0);
            if (maxInt < strings.get(i).length())
                 maxStr = strings.get(i);
            //System.out.println(strings.get(i));

        }
        System.out.println(maxStr);
    }
}
