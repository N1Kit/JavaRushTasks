package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Никитин", "Никита");
        map.put("Андреев", "Андрей");
        map.put("Михайлов", "Михаил");
        map.put("Александров", "Александр");
        map.put("Юрьев", "Юрий");
        map.put("Данилов", "Данил");
        map.put("Дмитриев", "Дмитрий");
        map.put("Сергеев", "Сергей");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();

        }
        removeItemFromMapByValue(map, map.get("Петров"));
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
