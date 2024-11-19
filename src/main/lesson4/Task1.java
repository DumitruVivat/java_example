package main.lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    static List<String> list = new LinkedList<>();
    public static void main(String[] args) {

        while (true) {
            printList();
        }
    }
    public static void printList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command (text~num or print~num):");
        String text = scanner.nextLine();
        String[] arr = text.split("~");
        String word = arr[0];
        int num = Integer.parseInt(arr[1]);
        if (num > list.size()) {
            for (int i = 0; i <= num; i++) {
                list.add(null);
            }
        }
        if (word.equals("print")) {
            System.out.println(list.get(num));
            list.remove(num);
        } else {
            list.add(num, arr[0]);
        }
    }
}
