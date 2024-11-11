package main.homework2.select;

import static main.homework2.select.Answer.select;

public class Printer {
    public static void main(String[] args) {

        String query = "SELECT * FROM students";
        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        StringBuilder sqlQuery = select(query, params);
        System.out.println(sqlQuery);
    }
}
