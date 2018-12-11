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

        /*  Так будет получше

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
