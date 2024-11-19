package main.lesson4.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GBStack<Integer> stack = new GBStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
