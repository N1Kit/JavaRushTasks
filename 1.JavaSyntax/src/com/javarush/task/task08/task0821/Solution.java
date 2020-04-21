package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Никитин", "Никита");
        map.put("Андреев", "Андрей");
        map.put("Михайлов", "Петр");
        map.put("Александров", "Александр");
        map.put("Юрьев", "Юрий");
        map.put("Данилов", "Данил");
        map.put("Дмитриев", "Дмитрий");
        map.put("Юрьев", "Дмитрий");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
