package main.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {

        System.out.println(intToRoman(2022)); // MMXXII
        System.out.println(intToRoman(9));    // IX
        System.out.println(intToRoman(58));   // LVIII
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < values.length; i++){

            while(num >= values[i]){
                num -= values[i];
                result.append(romans[i]);
            }
        }
        return result.toString();
    }
}
