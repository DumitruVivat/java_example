package main.homework3.minMax;

import java.util.ArrayList;

import static main.homework3.minMax.ListStatistics.calculateStatistics;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(7);
        numbers.add(3);

        calculateStatistics(numbers);
    }
}
