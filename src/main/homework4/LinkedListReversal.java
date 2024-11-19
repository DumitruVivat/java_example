package main.homework4;

import java.util.LinkedList;

public class LinkedListReversal {

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();

        for(T element : list) {
            reversedList.addFirst(element);
        }
        return reversedList;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        LinkedList<Integer> reversedList = reverseLinkedList(list);

        System.out.println("Reversed list: " + reversedList);

    }
}
