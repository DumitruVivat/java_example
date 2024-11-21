package main.homework4_2.deleteStrings;

import java.util.LinkedList;

public class Printer {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        if(args.length == 0) {
            list.add("apple");
            list.add("banana");
            list.add("orange");
            list.add("pear");
            list.add("grape");
        } else {
            for(String arg : args) {
                list.add(arg);
            }
        }


        LLTasks answer = new LLTasks();
        System.out.println(list);
        answer.removeOddLengthStrings(list);
        System.out.println(list);
    }
}
