package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> kratn3 = new ArrayList<>();
        ArrayList<Integer> kratn2 = new ArrayList<>();
        ArrayList<Integer> restList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
            if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 == 0){
                kratn3.add(mainList.get(i));
                kratn2.add(mainList.get(i));
            } else if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 != 0)
                kratn3.add(mainList.get(i));
            else if (mainList.get(i) % 3 != 0 && mainList.get(i) % 2 == 0)
                kratn2.add(mainList.get(i));
            else
                restList.add(mainList.get(i));
        }
        reader.close();

        printList(kratn3);
        printList(kratn2);
        printList(restList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i: list) {
            System.out.println(i);
        }
    }
}
