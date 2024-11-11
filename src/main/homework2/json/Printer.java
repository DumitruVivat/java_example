package main.homework2.json;

import static main.homework2.json.Answer.parseAndPrintStudents;
import static main.homework2.json.Answer.readJsonFromFile;

public class Printer {
    public static void main(String[] args) {

        String filePath = "catalog.txt";
        String jsonString = readJsonFromFile(filePath);

        if(jsonString != null) {
            parseAndPrintStudents(jsonString);
        }

    }
}
