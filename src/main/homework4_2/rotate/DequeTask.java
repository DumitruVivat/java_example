package main.homework4_2.rotate;

import java.util.Deque;

public class DequeTask {
    public static void rotateDeque(Deque<Integer> deque, int n) {
        if (deque.isEmpty()) return;
        int size = deque.size();

        n = n % size;
        if (n < 0) {
            n += size;
        }
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.removeFirst());
        }
        System.out.println(deque);
    }
}
