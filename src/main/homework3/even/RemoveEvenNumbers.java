package main.homework3.even;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {

    public static void removeEvenNumbers(ArrayList<Integer> list) {

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }
    public static void removeEvenNumbers2(ArrayList<Integer> list) {

        for(int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
