package main.hemowork3_2.filter;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        String[] arr;

        if (args.length == 0) {
            arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res =
                Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}
