package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> salary = new HashMap<>();
        salary.put("Иванов", 400);
        salary.put("Петров", 900);
        salary.put("Никитин", 3_000);
        salary.put("Андреев", 350);
        salary.put("Михайлов", 300);
        salary.put("Александров", 340);
        salary.put("Юрьев", 300);
        salary.put("Данилов", 400);
        salary.put("Дмитриев", 1_000);
        salary.put("Сергеев", 2_000);

        return salary;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if(pair.getValue()<500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}