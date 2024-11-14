package main.hemowork3_2.average;

public class AverageCalculator {
    public static int calculateAverage(int[] array) {
        if (array.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (int) Math.round((double) sum / array.length);
    }
}
