package main.homework2.sort;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Answer {

    private static final Logger logger = Logger.getLogger(Answer.class.getName());

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n - 1; i++) {
            swapped = false;

            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // Change array[j] with array[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            //writing in log file every iteration
            logArrayState(arr, i + 1);

            if(!swapped) {
                break;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void logArrayState(int[] array, int iteration) {
        StringBuilder sb = new StringBuilder("Iteration " + iteration + ": ");
        for(int num : array) {
            sb.append(num).append(" ");
        }
        logger.info(sb.toString());
    }

    public static void setupLogger() {
        try {
            FileHandler fh = new FileHandler("bubble_sort_log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
