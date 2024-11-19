package main.lesson4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task3 {

    public static <T> void pushToStack(T[] array) {
        Stack<T> stack = new Stack<>();

        for (T item : array) {
            stack.push(item);
        }

        System.out.println("Stack content:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static <T> void enqueueToQueue(T[] array) {
        Queue<T> queue = new LinkedList<>();

        for (T item : array) {
            queue.offer(item);
        }

        System.out.println("Queue content:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};

        pushToStack(intArray);

        enqueueToQueue(intArray);

        String[] stringArray = {"Hello", "World", "Java"};

        pushToStack(stringArray);

        enqueueToQueue(stringArray);
    }
}
