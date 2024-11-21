package main.lesson5;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Мороз", "и", "солнце", "день", "чудесный",
                "Еще", "ты", "дремлешь", "друг", "прелестный",
                "Пора", "красавица", "проснись"
        );

        Map<Integer,List<String>> sortedStrings = sortStringsByLength(strings);

        for (Map.Entry<Integer,List<String>> entry : sortedStrings.entrySet()) {
            System.out.println("Length "+entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, List<String>> sortStringsByLength(List<String> strings) {

        TreeMap<Integer,List<String>> lengthMap = new TreeMap<>();

        for(String sts: strings) {
            int length = sts.length();

            lengthMap.putIfAbsent(length, new ArrayList<>());
            lengthMap.get(length).add(sts);
        }
        return lengthMap;
    }
}
