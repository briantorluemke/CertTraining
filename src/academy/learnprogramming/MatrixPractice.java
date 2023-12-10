package academy.learnprogramming;

public class MatrixPractice {
    public static void main(String[] args) {
        // The input string containing rates, prices, and lock periods
        String strRates
        // Call the parseRatesString method to convert the string into a 2D matrix
        double[][] ratesMatrix = parseRatesString(strRates);

        // Call the generateHtmlTable method to create an HTML table from the matrix
        String htmlTable = generateHtmlTable(ratesMatrix);

        // Print the resulting HTML table to the console
        System.out.println(htmlTable);
    }

    // Method to convert the input string into a 2D matrix
    private static double[][] parseRatesString(String strRates) {
        // Split the input string into individual entries using the ";" delimiter
        String[] entries = strRates.split(";");

        // Get the number of rows (rowCount) and columns (colCount) for the matrix
        int rowCount = entries.length;
        int colCount = entries[0].split(",").length / 2; // Assuming all entries have the same number of rates

        // Initialize a 2D matrix to store the rates, prices, and lock periods
        double[][] ratesMatrix = new double[rowCount][colCount];

        // Loop through each entry and populate the matrix
        for (int i = 0; i < rowCount; i++) {
            // Split each entry into tokens using the ":" delimiter and select the rates part
            String[] tokens = entries[i].split(":")[0].split(",");

            // Populate the matrix with the rates (every second token, starting from the first)
            for (int j = 0; j < colCount; j++) {
                ratesMatrix[i][j] = Double.parseDouble(tokens[j * 2]);
            }
        }

        // Return the resulting 2D matrix
        return ratesMatrix;
    }

    // Method to generate an HTML table from the 2D matrix
    private static String generateHtmlTable(double[][] ratesMatrix) {
        // StringBuilder to construct the HTML table
        StringBuilder htmlTable = new StringBuilder("<html><body><table border='1'>");

        // Header row with lock periods
        htmlTable.append("<tr><th></th>");
        for (int i = 0; i < ratesMatrix.length; i++) {
            htmlTable.append("<th>").append("L").append((int) ratesMatrix[i][ratesMatrix[i].length - 1]).append("</th>");
        }
        htmlTable.append("</tr>");

        // Data rows with rates and prices
        for (int i = 0; i < ratesMatrix[0].length - 1; i++) {
            htmlTable.append("<tr><td>").append(ratesMatrix[i][0]).append("</td>");
            for (int j = 0; j < ratesMatrix.length; j++) {
                htmlTable.append("<td>").append(ratesMatrix[j][i + 1]).append("</td>");
            }
            htmlTable.append("</tr>");
        }

        // Close the HTML table tags
        htmlTable.append("</table></body></html>");

        // Return the resulting HTML table as a string
        return htmlTable.toString();
    }
}
