package main.homewokr2_2.clean;

public class TextCleaner {

    public static String removeEmptyLines(String text) {
        //Dividing text into lines
        String[] lines = text.split("\n");
        StringBuilder nonEmptyLines = new StringBuilder();

        //Adding nonempty strings into StringBuilder
        for (String line : lines) {
            if(!line.trim().isEmpty()) { // checking for empty strings
                nonEmptyLines.append(line).append("\n"); //adding strings
            }
        }

        //removing the last line
        if(!nonEmptyLines.isEmpty()) {
            nonEmptyLines.setLength(nonEmptyLines.length() - 1);
        }
        return nonEmptyLines.toString();
    }
}
