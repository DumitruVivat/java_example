package main.lesson1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Helper {


    public static int getSumElementsFromArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }

    public static void getUserDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userData = scanner.nextLine();

        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        String greeting;
        if (hour >= 5 && hour <= 12) {
            greeting = "Good Morning";
        } else if (hour >= 12 && hour <= 18) {
            greeting = "Good Afternoon";
        } else if (hour >= 18 && hour < 24) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }
        System.out.println(greeting + ", " + userData + "!");
        scanner.close();
    }

    public static int maxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : arr) {
            if (num == 1) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
        }
        return maxCount;
    }

    public static void moveElements(int[] nums, int val) {
        int insertPost = 0;

        for(int num : nums) {
            if(num != val) {
                nums[insertPost] = num;
                insertPost++;
            }
        }

        while (insertPost < nums.length) {
            nums[insertPost] = val;
            insertPost++;
        }

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static String reverseWords(String phrase) {
        String[] words = phrase.split(" ");
        StringBuilder reversePhrase = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            reversePhrase.append(words[i]);
            if (i != 0){
                reversePhrase.append(" ");
            }
        }
        return reversePhrase.toString();
    }

    public static double pow(double a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            return pow(1 / a, -b);
        }
        double res = pow(a, b / 2);
        return b % 2 == 0 ? res * res : res * res * a;
    }
    public static double powIterative(double a, double b) {
        if (a == 0 || a == 1) return a;
        if (b == 0) return 1;

        if (b < 0){
            b = -b;
            a = 1 / a;
        }

        double result = 1;
        while (b > 0) {
            if(b % 2 == 1){
                result *= a;
            }
            a = a * a;
            b = b / 2;
        }
        return result;
    }

    public static void generate(int source, int target, int c, int d, String path) {
        if (source > target) return;
        if (source == target) {
            System.out.println(path);
            return;
        }

        generate(source + c, target, c, d, path + " k1");
        generate(source * d, target, c, d, path + " k2");
    }

    public static int findPivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(leftSum == (totalSum - leftSum - nums[i])) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void writeDataToFile(String fileName) {
        String[] data = {
                "Name Surname Age",
                "Kate Smith 20",
                "Paul Green 25",
                "Mike Black 23"
        };

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for(String line : data) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Data successfully written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing data to file: " + e.getMessage());
        }
    }

    public static int getSumElementsFromMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }

    public static String reverse(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(s).append(" ");
        }
        return sb.reverse().toString();
    }

    public static int calculateTriangleNumber(int n) {
        return n * (n + 1) / 2;
    }
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void printPrimeNumbers(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for(int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {

                for(int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        System.out.println("Prime numbers star with 1 till " + n + ":");
        for (int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                System.out.println(i + " ");
            }
        }
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+' : return num1 + num2;
            case '-' : return num1 - num2;
            case '*' : return num1 * num2;
            case '/' :
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN;
                }
            default:
                return Double.NaN;
        }
    }

    public static void findSolution(String q, String w, String e) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String newQ = q.replace('?', (char) ('0' + i));
                String newW = w.replace('?', (char) ('0' + j));

                int numQ = Integer.parseInt(newQ);
                int numW = Integer.parseInt(newW);
                int numE = Integer.parseInt(e);

                if (numQ + numW == numE) {
                    System.out.printf("Solution: %s + %s = %s%n", newQ, newW, e);
                    return;
                }
            }
        }
        System.out.println("No solution");
    }
}
