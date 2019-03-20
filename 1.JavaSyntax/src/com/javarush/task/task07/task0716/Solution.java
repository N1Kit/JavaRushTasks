package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list.add("поза");
        list.add("рана");
        list.add("кожа");
        list.add("лажа");
        list.add("лама");
        list.add("пола");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л"))
                continue;
            else if (list.get(i).contains("р")) {
                list.remove(i);
                i--;
            } else if (list.get(i).contains("л")) {
                list.add(i+1, list.get(i));
                i+=2;
            }
        }
        return list;
    }
}