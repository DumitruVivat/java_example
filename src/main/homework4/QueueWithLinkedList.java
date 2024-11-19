package main.homework4;

import java.util.LinkedList;

public class QueueWithLinkedList <T>{
    private LinkedList<T> queue;

    public QueueWithLinkedList(){
        queue = new LinkedList<>();
    }

    public void enqueue(T element){
        queue.addLast(element);
    }

    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return queue.pollFirst();
    }

    public T first() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        QueueWithLinkedList<Integer> queue = new QueueWithLinkedList<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue size: " + queue.size());
        System.out.println("First element: " + queue.first());
        System.out.println("Delete element: " + queue.dequeue());
        System.out.println("Queue size after deleting: " + queue.size());
        System.out.println("Is empty queue? " + queue.isEmpty());

    }
}
