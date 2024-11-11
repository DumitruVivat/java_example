package main.homework2.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Answer {

    //Method to read JSON string from a text file
    public static String readJsonFromFile(String fileName) {
        StringBuilder jsonBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return jsonBuilder.toString();
    }

    //Method to parse the JSON and form strings
    public static void parseAndPrintStudents(String jsonString) {
        jsonString = jsonString.trim(); // remove leading and trailing whitespace
        jsonString = jsonString.substring(1, jsonString.length() - 1);// Remove brackets

        //Split the JSON string into individual student records
        String[] studentRecords = jsonString.split("\\},\\{");

        StringBuilder studentBuilder = new StringBuilder();

        for(String record : studentRecords) {
            //Clean up the record and extract values
            record = record.replaceAll("[{}\"]",""); // remove curly braces and quotes
            String[] keyValuePairs = record.split(",");

            String surname = "";
            String grade = "";
            String subject = "";

            for(String pair : keyValuePairs) {
                String[] keyValue = pair.split(":");
                if(keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();

                    //Assign values
                    if (key.equals("фамилия")) {
                        surname = value;
                    } else if (key.equals("оценка")) {
                        grade = value;
                    } else if (key.equals("предмет")) {
                        subject = value;
                    }
                }
            }

            // Build the output string
            studentBuilder.append("Студент ")
                    .append(surname)
                    .append(" получил ")
                    .append(grade)
                    .append(" по предмету ")
                    .append(subject)
                    .append(".\n");
        }

        // Output the result
        System.out.println(studentBuilder.toString());
    }
}
