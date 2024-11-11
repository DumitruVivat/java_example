package main.homewokr2_2.csv;

import static main.homewokr2_2.csv.CSVGenerator.generateCSV;
import static main.homewokr2_2.csv.CSVGenerator.generateCSV2;

public class Printer {
    public static void main(String[] args) {
        String[] headers = {};
        String[][] data = {};

        if(args.length == 0) {

            headers = new String[] {"Name", "Age","City"};
            data = new String[][] {
                    {"John", "30", "New York"},
                    {"Alice", "25", "Los Angeles"},
                    {"Bob", "35", "Chicago"}
            };
        } else {
            //Processing input parameters
        }

//        System.out.println(generateCSV(headers, data));
        System.out.println(generateCSV2(headers, data));
    }
}
