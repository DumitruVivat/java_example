package main.hemowork3_2.average;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{4, 2, 7, 5, 1};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}
