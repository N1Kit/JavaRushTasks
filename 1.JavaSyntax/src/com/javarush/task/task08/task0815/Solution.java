package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Сергей");
        map.put("Иванов", "Александр");
        map.put("Сидоров", "Петр");
        map.put("Федоренко", "Сергей");
        map.put("Сидорчук", "Иван");
        map.put("Девяткин", "Сергей");
        map.put("Щеглов", "Андрей");
        map.put("Юдин", "Дмитрий");
        map.put("Булин", "Роман");
        map.put("Шашлыков", "Сергей");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if(pair.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if(pair.getKey().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
