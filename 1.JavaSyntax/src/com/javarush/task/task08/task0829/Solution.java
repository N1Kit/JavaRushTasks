package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> list = new HashMap<>();
        String city = "";
        while (true) {
            city = reader.readLine();
            String family = reader.readLine();
            if (city.equals("")) break;
            else
            list.put(city, family);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());

        System.out.println(list.get(city));

    }
}
