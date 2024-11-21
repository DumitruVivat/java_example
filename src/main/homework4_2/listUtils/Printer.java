package main.homework4_2.listUtils;

import java.util.LinkedList;

public class Printer {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        String value;

        if (args.length == 0) {
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");
            value = "banana";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                list.add(args[i]);
            }
            value = args[args.length - 1];
        }

        ListUtils utils = new ListUtils();
        System.out.println("Occurrences of \"" + value + "\": " + utils.countOccurrences(list, value));
    }
}
