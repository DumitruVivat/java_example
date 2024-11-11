package main.homewokr2_2.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SecondArrayOperation {
    private static File log;
    private static FileWriter fileWriter;

    // initialize the log file
    static {
        try{
            log = new File("log2.txt");
            fileWriter = new FileWriter(log, true);
        } catch (IOException e) {
            System.out.println("Error to initialize log-file: " + e.getMessage());
        }
    }

    public static void findMinMax(int[] arr) {
        if(arr == null || arr.length == 0) {
            System.out.println("Array is null or empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        //searching min and max element
        for (int num : arr) {
            if(num < min) {
                min = num;
                logStep(min, max);
            }
            if (num > max) {
                max = num;
                logStep(min, max);
            }
        }

        System.out.println("Min element: " + min + "\nMax element: " + max);
    }

    private static void logStep(int min, int max) {
        String logEntry = getCurrentTimeStamp() + " {Minimum: " + min + ", Maximum: " + max + "}\n";

        try {
            fileWriter.write(logEntry);
            fileWriter.flush(); // flushing buffer to a file
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static String getCurrentTimeStamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    // Closing FileWriter to shutting down

    public static void closeLog() {
        try{
            if(fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Error to close log file: " + e.getMessage());
        }
    }
}
