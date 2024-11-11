package main.homewokr2_2.clean;

import static main.homewokr2_2.clean.TextCleaner.removeEmptyLines;

public class Printer {
    public static void main(String[] args) {

        String text = "";

        if(args.length == 0) {
            text = "line1\n\nline2\n\nline3";
        } else {
            text = args[0];
        }

        System.out.println(removeEmptyLines(text));
    }
}
