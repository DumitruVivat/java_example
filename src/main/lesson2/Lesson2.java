package main.lesson2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static main.lesson2.Examples.*;
import static main.lesson2.FileNames.getFileNamesInDir;
import static main.lesson2.FileNames.writeFileNamesToFile;

public class Lesson2 {

    public static void main(String[] args) {

//        try{
//            int[] arr = new int[3];
//            arr[11]= 11;
//            int i = 1/0;
//
//        } catch (IndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBoundsException");
//        } catch (ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }finally {
//            System.out.println("finally");
//        }

//        String word = "AN, na";
//        System.out.println(isPalindrome(word));
//
//        System.out.println(Arrays.toString(getFileNamesInDir(".")));
//        writeFileNamesToFile(".","task5.txt");

//        int N = 10;
//        char c1 = 'A';
//        char c2 = 'B';
//        System.out.println(generateAlternatingString(N, c1, c2));

//        String input = "aaaabbbcdd";
//        System.out.println(compressString(input));
//
//        String input1 = "radar";
//        String input2 = "hello";
//
//        System.out.println(isPalindrome(input1));
//        System.out.println(isPalindrome(input2));

//        String repetedString = createRepeatedString("TEST", 100);
//        String filePath = "output.txt";
//
//        writeStringToFile(repetedString, filePath);
//        System.out.println("Word successfully was written to " + filePath);
//
        String[] contents = getCurrentDirectoryContents();
        //        System.out.println("Current directory content: ");
//        for (String content : contents) {
//            System.out.println(content);
//        }

//        String filePath = "directory_contents.txt";
//        writeArrayToFile(contents, filePath);
//        System.out.println("Current directory content: " + filePath);
        System.out.println("File extension in current directory: ");
        for (int i = 0; i < contents.length; i++) {
            String fileName = contents[i];
            String extension = getFileExtension(fileName);
            System.out.println((i + 1) + " File extension: " + extension);
        }
    }
}
