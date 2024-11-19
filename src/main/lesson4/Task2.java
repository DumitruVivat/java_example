package main.lesson4;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the line or command: ");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                if (stack.isEmpty()) {
                    System.out.println("No lines to print.");
                } else {
                    Stack<String> tempStack = new Stack<>();
                    tempStack.addAll(stack);
                    while (!tempStack.isEmpty()) {
                        System.out.println(tempStack.pop());
                    }
                }
            } else if (input.equals("revert")) {

                if (!stack.isEmpty()){
                    stack.pop();
                    System.out.println("The last line was deleted");
                } else {
                    System.out.println("No lines to delete.");
                }
            } else {
                stack.push(input);
            }
        }
    }
}
