package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add(0, "zero");
        list.add("three");
        list.add(2, "two");
        list.add("four");
        System.out.println(list.size());
        for (String i:list
             ) {
            System.out.println(i);
        }
    }
}
