package main.homework4_2.rotate;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Printer {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
        int n;

        if(args.length < 1) {
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);

            n = 1;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }

        DequeTask.rotateDeque(deque, n);
    }
}
