package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double min = Double.parseDouble(scanner.nextLine());
        String trafficLight;
        if (min/3<=1){
            trafficLight = "зеленый";
        }   else if (min/4>=1 && min/4<=1.25){
            trafficLight = "желтый";
        } else if (min/5>=1 && min/5<=1.19)
            trafficLight = "красный";
        else trafficLight = "";
        System.out.println(trafficLight);
    }
}