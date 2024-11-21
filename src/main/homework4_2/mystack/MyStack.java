package main.homework4_2.mystack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack {

    private LinkedList<String> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(String element) {
        stack.addLast(element);
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.removeLast();
    }

    public String peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getLast();
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
