package main.lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task0 {
    public static void main(String[] args) {

        Map<Integer,String> map = new TreeMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
//        System.out.println(map.get(123456));
//        map.put(123456, map.get(321456));
//        System.out.println(map.get(123456));
//        map.clear();
//        System.out.println(map);
//        System.out.println(map.entrySet());
//        Map<Integer,String> map1 = Map.of(123456, "Иванов",321456, "Васильев");
//        System.out.println(map1);
//        map1.put(234561, "Петрова");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
