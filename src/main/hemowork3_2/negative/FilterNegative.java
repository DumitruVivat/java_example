package main.hemowork3_2.negative;

import java.util.ArrayList;

public class FilterNegative {

    public static int[] filterNegative(int[] array) {
        //create list to store non-negative numbers
        ArrayList<Integer> nonNegativeNumbers = new ArrayList<>();

        // going through each element of array
        for(int num : array) {
            if(num >= 0) {
                //if number is not negative, we add to list
                nonNegativeNumbers.add(num);
            }
        }

        // convert list to an array
        int[] result = new int[nonNegativeNumbers.size()];
        for(int i = 0; i < nonNegativeNumbers.size(); i++) {
            result[i] = nonNegativeNumbers.get(i);
        }
        return result;
    }
}
