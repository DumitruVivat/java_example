package main.hemowork3_2.filter;

import java.util.ArrayList;

public class FilterStrings {

    public static String[] filterShortStrings(String[] array) {
        ArrayList<String> shortStrings = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() > 3) {
                shortStrings.add(array[i]);
            }
        }
        String[] filteredArray = new String[shortStrings.size()];
        for (int i = 0; i < shortStrings.size(); i++) {
            filteredArray[i] = shortStrings.get(i);
        }
        return filteredArray;
    }
}
