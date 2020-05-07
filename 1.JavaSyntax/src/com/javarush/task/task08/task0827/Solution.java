package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution {
  public static void main(String[] args) {
    System.out.println(isDateOdd("JANUARY 1 2013"));
  }

  public static boolean isDateOdd(String date) {
    SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
    try {
      Date dateNew = format.parse(date); // преобразовали в дату из строки
      Date yearStartTime = new Date(dateNew.getTime());      // создаем новую дату

      /*Задаем начало года*/
      yearStartTime.setHours(0);
      yearStartTime.setMinutes(0);
      yearStartTime.setSeconds(0);

      yearStartTime.setDate(1);
      yearStartTime.setMonth(Calendar.JANUARY);

      int msDay = 24 * 60 * 60 * 1000; // миллисек. в сутках
      long msTimeDist = dateNew.getTime() - yearStartTime.getTime();

      long dayCount = (int) (msTimeDist / msDay);
      dayCount++;

      if (dayCount % 2 != 0)
        return true;
      else
        return false;
    } catch (ParseException e) {
      e.printStackTrace();
    }
      return false;
  }
}
