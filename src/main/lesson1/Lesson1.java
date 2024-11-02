package main.lesson1;

import java.util.Arrays;
import java.util.Scanner;

import static main.lesson1.Helper.*;

public class Lesson1 {
    public static void main(String[] args) {
//        int - 32 4, int / 0
//        long - 64 8,

//        float - 32 4, /0 - Float,Nan
//        double - 64 8,

//        short - 16,
//        boolean - 1 (8),
//        byte - 8,
//        char

//        String str = "Hello World";
//        System.out.println(str.indexOf('o'));

//        System.out.printf("%s and %s",2, 4);


//        String chars = new String(new char[]{'H', 'e', 'l','l','o'});

//        System.out.println(str);
//        System.out.println(chars);

//        Helper helper = new Helper();
//        long l = 123;
//
//        System.out.println(1 + l);
//        // 4 - 1 2 3 4 = 10

//        System.out.println(Helper.getLocalDateTime());
//        Helper.getUserDataFromConsole();

//        int[] binaryArray = {1, 1, 0, 1, 1, 1};
//        int result = maxConsecutiveOnes(binaryArray);
//        System.out.println("Maximum number of consecutive is: " + result);

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("Sum of array: " + getSumElementsFromArray(numbers));

//        int[] nums = {3, 2, 2, 3};
//        int val = 3;
//        moveElements(nums, val);
//        System.out.println("Modified array: " + Arrays.toString(nums));

//        String[] strs = {"flower", "flow", "flight"};
//        String result = longestCommonPrefix(strs);
//        System.out.println("Longest common prefix: " + result);
//        String phrase = "Добро пожаловать на курс по Java";
//        String reversed = reverseWords(phrase);
//        System.out.println(reversed);

//        System.out.println(powIterative(3, 2));
//        System.out.println(powIterative(2, -2));
//        System.out.println(powIterative(3, 0));

//        generate(1, 7, 1, 3, "");
//        generate(11, 7, 2, 1, "");

//        int[] nums = {1, 7, 3, 6, 5, 6};
//        int index = findPivotIndex(nums);
//        System.out.println("Индекс: " + index);
//        writeDataToFile("people.txt");

//        int[][] matrix = new int[][] {
//                {2, 3},
//                {1, 2, 3, 4}
//        };
//        System.out.println(Helper.getSumElementsFromMatrix(matrix));

//        String toReverse = "Добро пожаловать на курс по Java";
//        System.out.println(Helper.reverse(toReverse));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter value N: ");
//        int n = scanner.nextInt();
//
//        int triangleNumber = calculateTriangleNumber(n);
//        long factorial = calculateFactorial(n);
//
//        System.out.println("Triangle number: " + triangleNumber);
//        System.out.println("Factorial: " + factorial);

//        int limit = 1000;
//        printPrimeNumbers(limit);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Simple calculator: ");
//        System.out.println("Enter a number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.println("Enter second number: ");
//        double num2 = scanner.nextDouble();
//
//        System.out.println("Enter operator (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);
//
//        double result = calculate(num1, num2, operator);
//
//        if (Double.isNaN(result)) {
//            System.out.println("NaN");
//        } else {
//            System.out.printf("Result: %.2f", result);
//        }

        String q = "2?";
        String w = "?5";
        String e = "50";

        findSolution(q, w, e);
    }
}
