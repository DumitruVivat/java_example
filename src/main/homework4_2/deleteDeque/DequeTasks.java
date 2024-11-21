package main.homework4_2.deleteDeque;

import java.util.Deque;
import java.util.Iterator;

public class DequeTasks {

    public static void removeAllOccurrences(Deque<String> deque,String value) {

        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(value)) {
                iterator.remove();
            }
        }
        System.out.println(deque);
    }
}
