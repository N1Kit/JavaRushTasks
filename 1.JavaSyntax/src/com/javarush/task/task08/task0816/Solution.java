package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Сталин", dateFormat.parse("DECEMBER 18 1878"));
        map.put("Путин", dateFormat.parse("OCTOBER 7 1952"));
        map.put("Гитлер", dateFormat.parse("APRIL 20 1889"));
        map.put("Чак Норрис", dateFormat.parse("JUNE 1 2000"));
        map.put("Джеки Чан", dateFormat.parse("NOVEMBER 12 1987"));
        map.put("Сталыпин", dateFormat.parse("MAY 15 2001"));
        map.put("Ван Дамм", dateFormat.parse("JANUARY 6 1954"));
        map.put("Жириновский", dateFormat.parse("MAY 25 1975"));
        map.put("Калашников", dateFormat.parse("FEBRUARY 1 1988"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map)  {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if(date.getMonth() >= 5 && date.getMonth() <= 7)
                iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {
    }
}
