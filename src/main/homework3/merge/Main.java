package main.homework3.merge;

import static main.homework3.merge.MergeSort.mergeSort;
import static main.homework3.merge.MergeSort.printArray;

public class Main {
    public static void main(String[] args) {

        int[] array = {12, 11, 14, 5, 6, 7};

        System.out.println("Source array:");
        printArray(array);

        mergeSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
