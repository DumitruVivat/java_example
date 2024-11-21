package main.homework5_2.students;

import java.util.*;

public class StudentDirectory {

    private Map<String,List<Integer>> studentsMap;

    public StudentDirectory() {
        studentsMap = new HashMap<>();
    }

    public void addStudent(String name, Integer grade) {
        studentsMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
    }

    public List<Integer> findStudent(String name) {
        return studentsMap.getOrDefault(name, new ArrayList<>());
    }

    public Map<String, List<Integer>> getAllStudents() {
        return new HashMap<>(studentsMap);
    }

    public void removeStudent(String name) {
        studentsMap.remove(name);
    }

    public void printAllStudents() {
        if (studentsMap.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        for (Map.Entry<String, List<Integer>> entry : studentsMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + " | Grades: " + entry.getValue());
        }
    }
}
