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
        strings = new ArrayList<>();

        String maxStr = "";
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {   // добавление строк в список
            String s = scanner.nextLine();
            strings.add(s);
        }
        scanner.close();

        for (String string : strings) {       // нашли самую длинную строку в списке
            if (maxStr.length() < string.length())
                maxStr = string;
        }

        for (String str : strings) {        // вывод строк с одинаковым максимальным количеством символов
            if(str.length() == maxStr.length()){
                System.out.println(str);
            }
        }
    }
}
