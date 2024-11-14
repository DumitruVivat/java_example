package main.hemowork3_2.unique;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

    public static int[] getUniqueElements(int[] arr) {

        //creating Set to store unique elements
        Set<Integer> set = new HashSet<>();

        //add all elements in Set
        for(int num : arr) {
            set.add(num); // Set automatically remove duplicates
        }
        // convert Set back to array
        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set) {
            result[index++] = num;
        }
        return result;
    }
}
