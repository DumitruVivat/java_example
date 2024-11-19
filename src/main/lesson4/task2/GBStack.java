package main.lesson4.task2;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class GBStack <T> {
    private int capacity = 2;
    private int size = 0;
    private int top = -1;
    private T[] values = (T[]) new Object[capacity];

    private void addCapacity() {
        capacity *= 2;
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(T item) {
        if (capacity == size)
            addCapacity();
        values[++top] = item;
        size++;
    }

    public T peek() {
        if (!empty())
            return values[top];
        else throw new NoSuchElementException("Stack is empty");
    }

    public T pop() {
        if (empty())
            throw new NoSuchElementException("Stack is empty");
        else
            peek();
            size--;
        return values[top--];
}


    public String toString() {
        if(empty()) return "[]";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(values[i]).append(", ");
        }
        return String.format("[%s]", sb);
    }
}
