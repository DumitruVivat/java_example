package main.homework1.factorial;

public class Answer {
    public int factorialRecursion(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        return n * factorialRecursion(n - 1);
    }
    public int factorial(int n) {

        if (n < 0) return -1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
