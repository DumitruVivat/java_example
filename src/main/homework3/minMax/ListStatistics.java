package main.homework3.minMax;

import java.util.ArrayList;

public class ListStatistics {

    public static void calculateStatistics(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;

        for(int num : list) {

            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
            sum += num;
        }

        double average = (double) sum / list.size();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}
