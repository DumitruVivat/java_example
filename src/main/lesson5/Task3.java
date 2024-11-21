package main.lesson5;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        String romanNumber = "MMLXII";
        int arabicNumber = romanToArabic(romanNumber);
        System.out.println("Roman Number: " + romanNumber + " Arabic Number: " + arabicNumber);
    }

    public static int romanToInt(String roman) {
        Map<Character,Integer> numbers = new HashMap<>();
        numbers.put('I',1);
        numbers.put('V',5);
        numbers.put('X',10);
        numbers.put('L',50);
        numbers.put('C',100);
        numbers.put('D',500);
        numbers.put('M',1000);

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() -1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = numbers.get(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }

    public static int romanToArabic(String roman) {
        Map<String,Integer> numbers = Map.of(
                "I",1,
                "V",2,
                "X",10,
                "L",50,
                "C",100,
                "D",500,
                "M",1000
        );

        int result = 0;
        List<Integer> numList = new ArrayList<>();
        String[] arrStr = roman.split("");
        for (int i = 0; i < arrStr.length; i++) {
            numList.add(numbers.get(arrStr[i]));
        }
        for (int i = 0; i < numList.size() - 1; i++) {
            if (numList.get(i) < numList.get(i + 1)) {
                result -= numList.get(i);
            } else {
                result += numList.get(i);
            }
        }
        result += numList.get(numList.size() - 1);
        return result;
    }
}
