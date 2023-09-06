package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Johnson", "Alice");
        map.put("Williams", "Michael");
        map.put("Jones", "Emily");
        map.put("Brown", "David");
        map.put("Davis", "Olivia");
        map.put("Miller", "Robert");
        map.put("Wilson", "Sophia");
        map.put("Moore", "William");
        map.put("Taylor", "Emma");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String str : map.values()) {
            if (name.equals(str)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String str : map.keySet()) {
            if (lastName.equals(str)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
