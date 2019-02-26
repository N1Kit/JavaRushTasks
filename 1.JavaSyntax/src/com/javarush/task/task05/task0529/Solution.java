package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();

            if(s.equals("сумма")){
                System.out.println(sum);
                break;
            }
            else {
                int num = Integer.parseInt(s);
                sum += num;
            }
        }
        reader.close();
    }
}
