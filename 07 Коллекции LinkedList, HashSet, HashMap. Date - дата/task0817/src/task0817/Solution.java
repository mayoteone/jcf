package task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "Emma");
        map.put("Johnson", "Alice");
        map.put("Williams", "Michael");
        map.put("Jones", "Emily");
        map.put("Brown", "David");
        map.put("Davis", "Emily");
        map.put("Miller", "Robert");
        map.put("Wilson", "Sophia");
        map.put("Moore", "William");
        map.put("Taylor", "Emma");

        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> mapCopy1 = new HashMap<>(map);
        Map<String, String> mapCopy2 = new HashMap<>(map);
        for (var pair1 : mapCopy1.entrySet()) {
            for (var pair2 : mapCopy2.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue()) && !pair1.getKey().equals(pair2.getKey())) {
                    removeItemFromMapByValue(map, map.get(pair1.getKey()));
                    removeItemFromMapByValue(map, map.get(pair2.getKey()));
                }
            }
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
    }
}
