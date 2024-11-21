package main.homework4_2.listUtils;

import java.util.LinkedList;

public class ListUtils {

    public static int countOccurrences(LinkedList<String> list, String word) {
        int count = 0;

        for(String str : list) {
            if(str.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
