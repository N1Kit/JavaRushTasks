package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //Date date = new Date();
        System.out.printf("%1$s %2$td %2$tm %2$tY", "", new Date());
        //System.out.printf("%s %te %<tB %<tY", "", date);
    }
}
