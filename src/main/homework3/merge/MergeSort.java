package main.homework3.merge;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        //if array has more than one element
        if (arr.length > 1) {
            //split array in 2 half
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right  = new int[arr.length - mid];

            // copy the left and right part of array
            for(int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for(int i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }

            //Recursive sort both parts
            mergeSort(left);
            mergeSort(right);


            //merging sort parts into array
            merge(arr, left, right);
        }
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k =0;

        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
