package main.homewokr2_2.log;

public class SecondPrinter {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7};
        SecondArrayOperation.findMinMax(array);
        SecondArrayOperation.closeLog(); // closing log-file
    }
}
