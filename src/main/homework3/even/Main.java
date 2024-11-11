package main.homework3.even;

import java.util.ArrayList;

import static main.homework3.even.RemoveEvenNumbers.removeEvenNumbers;
import static main.homework3.even.RemoveEvenNumbers.removeEvenNumbers2;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Source list: " + numbers);

//        removeEvenNumbers(numbers);
        removeEvenNumbers2(numbers);

        System.out.println("List after removing even numbers: " + numbers);
    }
}
