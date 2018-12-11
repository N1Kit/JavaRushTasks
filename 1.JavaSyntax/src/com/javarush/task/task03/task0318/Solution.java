package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        /*  Можно так
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(name + " захватит мир через " + num + " лет. Му-ха-ха!");
        scanner.close();
        */

        //  Так будет получше
        /*
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        if (scanner.hasNextInt()) {                 //проверка являются ли введенные данные числом
            age = Integer.parseInt(scanner.nextLine());
        } else {
            System.out.println("Это не ЧИСЛО! Перезапустите программу и введите ЧИСЛО.");
        }
        if (scanner.hasNextLine()) {                //проверка являются ли введенные данные строкой, хотя при вводе числа компилятор воспринимает его строкой
            name = scanner.nextLine();
        } else {
            System.out.println("Это не СТРОКА! Перезапустите программу и введите СТРОКУ.");
        }
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
        scanner.close();
         */


        //лучше всего так
      InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}
