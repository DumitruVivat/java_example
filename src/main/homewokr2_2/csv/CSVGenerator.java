package main.homewokr2_2.csv;

public class CSVGenerator {

    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csvBuilder = new StringBuilder();

        //Add headers
        appendRow(csvBuilder, headers);

        // Add data
        for(String[] row: data) {
            appendRow(csvBuilder, row);
        }
        return csvBuilder.toString();
    }

    private static void appendRow(StringBuilder csvBuilder, String[] row) {
        for (int i = 0; i < row.length; i++) {
            csvBuilder.append(row[i]);
            if (i < row.length - 1) {
                csvBuilder.append(","); // add a comma between the values
            }
        }
        csvBuilder.append("\n"); // New line
    }

    public static String generateCSV2(String[] headers, String[][] data) {
        StringBuilder csvBuilder = new StringBuilder();

        csvBuilder.append(String.join(" ", headers)).append("\n");

        for(String[] row: data) {
            csvBuilder.append(String.join(",", row)).append("\n");
        }

        return csvBuilder.toString().trim();
    }
}
