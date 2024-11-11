package main.homework2.sort;

import static main.homework2.sort.Answer.*;

public class Printer {
    public static void main(String[] args) {

        int[] array = {8, 9, 4, 5, 6, 7, 8, 4};

        setupLogger();

        bubbleSort(array);
    }
}
