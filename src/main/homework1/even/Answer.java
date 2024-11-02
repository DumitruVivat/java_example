package main.homework1.even;

public class Answer {

    public static void printEvenNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
    }
}
