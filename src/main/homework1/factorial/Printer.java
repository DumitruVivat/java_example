package main.homework1.factorial;

public class Printer {
    public static void main(String[] args) {
        int n = 5;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        Answer ans = new Answer();
        int itresume_res = ans.factorialRecursion(n);
        System.out.println(itresume_res);
    }
}
