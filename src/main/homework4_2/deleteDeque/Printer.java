package main.homework4_2.deleteDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Printer {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        String value;

        if (args.length < 2) {

            deque.add("apple");
            deque.add("banana");
            deque.add("apple");
            deque.add("cherry");
            value = "apple";
        } else {
            for (int i = 0; i < args.length; i++) {
                deque.add(args[i]);
            }
            value = args[args.length - 1];
        }

        DequeTasks.removeAllOccurrences(deque, value);
    }
}
