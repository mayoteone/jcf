package task0827;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(date, formatter);
        int totalDays = localDate.getDayOfYear();
        return totalDays % 2 != 0;
         */
        Date startYear = new Date(date);
        startYear.setMonth(0);
        startYear.setDate(1);
        Date today = new Date(date);
        long msDistance = today.getTime() - startYear.getTime();
        int dayCount = (int) (msDistance / (24 * 60 * 60 * 1000) + 1);

        return dayCount % 2 != 0;
    }
}
