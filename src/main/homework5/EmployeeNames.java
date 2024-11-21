package main.homework5;

import java.util.*;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Мария Смирнова", "Иван Петров", "Ольга Кузнецова",
                "Иван Сидоров", "Мария Петрова", "Алексей Иванов", "Ольга Смирнова",
                "Иван Смирнов", "Алексей Петров", "Иван Иванов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCountMap.entrySet());
        sortedNames.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Duplicate workers names with numbers of repetitions:");
        for (Map.Entry<String, Integer> entry : sortedNames) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
