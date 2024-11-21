package main.homework4_2.deleteStrings;

import java.util.Iterator;
import java.util.LinkedList;

public class LLTasks {
    public static void removeOddLengthStrings(LinkedList<String> list) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();

            if (str.length() % 2 != 0) {
                iterator.remove();
            }
        }
    }
}
