package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int buf = Integer.parseInt(bufferedReader.readLine());
        int number = buf > 0 ? buf*2 : buf+1;
        if (buf==0) number=0;
        System.out.println(number);

        inputStream.close();
        inputStreamReader.close();
        bufferedReader.close();
    }

}