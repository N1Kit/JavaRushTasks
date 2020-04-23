package com.javarush.task.task08.task0817;

import java.lang.reflect.Array;
import java.util.*;

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
    map.put("Андреев", "Сергей");
    map.put("Михайлов", "Михаил");
    map.put("Александров", "Александр");
    map.put("Юрьев", "Юрий");
    map.put("Данилов", "Юрий");
    map.put("Дмитриев", "Дмитрий");
    map.put("Сергеев", "Сергей");
    return map;
  }

  public static void removeTheFirstNameDuplicates(Map<String, String> map) {
    //напишите тут ваш код
    Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();     //получение итератора для списка
    ArrayList<String> arr = new ArrayList<>();
    while (i.hasNext()) {
      Map.Entry<String, String> pair = i.next(); //получение пары элементов
      arr.add(pair.getValue());
    }
    Collections.sort(arr);
    for (int j = 1; j < arr.size(); j++) {
      if(arr.get(j).equals(arr.get(j-1)))
       removeItemFromMapByValue(map,arr.get(j));
    }
  }

  public static void removeItemFromMapByValue(Map<String, String> map, String value) {
    Map<String, String> copy = new HashMap<>(map);
    for (Map.Entry<String, String> pair : copy.entrySet()) {
      if (pair.getValue().equals(value)) {
        map.remove(pair.getKey());
      }
    }
  }

  public static void main(String[] args) {
    removeTheFirstNameDuplicates(createMap());
  }
}
