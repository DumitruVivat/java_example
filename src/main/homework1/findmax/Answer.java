package main.homework1.findmax;

public class Answer {

    public int findMaxOfTow(int a, int b) {
        return Math.max(a, b);
    }

    public int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTow(findMaxOfTow(a, b), c);
    }
}
