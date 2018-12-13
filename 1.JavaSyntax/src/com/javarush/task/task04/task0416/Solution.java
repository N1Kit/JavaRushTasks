package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double min = Double.parseDouble(scanner.nextLine());
        String trafficLight;
        if (min%5>=0 && min%5<3){
            trafficLight = "зеленый";
        }   else if (min%5>=3 && min%5<4){
            trafficLight = "желтый";
        } else
            trafficLight = "красный";
        System.out.println(trafficLight);
    }
}