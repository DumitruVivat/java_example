package main.lesson2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Examples {

    public static String generateAlternatingString(int N, char c1, char c2) {
        if(N <= 0 || N % 2 != 0) {
            throw new IllegalArgumentException("N must be a even number or greater than zero");
        }

        StringBuilder sb = new StringBuilder(N);
        for(int i = 0; i < N; i++) {
            if(i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static String compressString(String input) {
        if(input == null || input.isEmpty()){
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                compressed.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        compressed.append(currentChar);
        compressed.append(count);

        return compressed.toString();
    }

    public static boolean isPalindrome(String input) {
        if(input == null || input.isEmpty()){
            return false;
        }

        int left = 0, right = input.length() - 1;

        while (left < right) {
            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String createRepeatedString(String word, int count) {
        StringBuilder repeatedString = new StringBuilder();
        for(int i = 0; i < count; i++) {
            repeatedString.append(word);
        }
        return repeatedString.toString();
    }

    public static void writeStringToFile(String content, String filePath) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static String[] getCurrentDirectoryContents() {
        File currentDirectory = new File(".");
        String[] fileList = currentDirectory.list();

        if (fileList == null) {
            return new String[0];
        }

        return fileList;
    }

    public static void writeArrayToFile(String[] content, String filePath) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for(String line : content) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            logError("Error writing to file: " + e.getMessage());
        }
    }

    public static void logError(String message) {
        try(BufferedWriter logWriter = new BufferedWriter(new FileWriter("error_log.txt", true))) {
            logWriter.write(message);
            logWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to log-file: " + e.getMessage());
        }
    }

    public static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if(lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex + 1);
        }
        return "";
    }
}
