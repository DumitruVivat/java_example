package main.homework5_2.merge;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length){
            result[k++] = left[i++];
        }
        while (j < right.length){
            result[k++] = right[j++];
        }
        return result;
    }
    public static int[] mergeSort(int[] arr) {

        if(arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static void main(String[] args) {

        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортировка слиянием
        int[] sortedArray = mergeSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }
}
