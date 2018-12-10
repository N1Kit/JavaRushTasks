package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String sMoney =  bufferedReader.readLine();
        int nMoney = Integer.parseInt(sMoney);
        String sYear =  bufferedReader.readLine();
        int nYear = Integer.parseInt(sYear);

        System.out.println(name + " получает " + nMoney + " через " +nYear + " лет.");
    }
}
