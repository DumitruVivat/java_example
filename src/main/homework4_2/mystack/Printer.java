package main.homework4_2.mystack;

public class Printer {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        if (args.length == 0) {
            stack.push("apple");
            stack.push("orange");
            stack.push("banana");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }

        System.out.println(stack.getElements());

        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}
