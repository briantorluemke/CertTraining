package academy.learnprogramming;

public class GradeTableGenerator {

    public static void main(String[] args) {
        // Input string with subjects and scores
        String inputString = "Math:90;Science:85;History:95;";

        // Call the generateHtmlTable method to create an HTML table
        generateHtmlTable(inputString);
    }

    private static void generateHtmlTable(String inputString) {
        // Split the input string into individual entries using the semicolon as a delimiter
        String[] entries = inputString.split(";");

        // Initialize arrays to store subjects and scores separately
        String[] subjects = new String[entries.length];
        int[] scores = new int[entries.length];

        // Initialize a StringBuilder to construct the HTML table
        StringBuilder htmlTable = new StringBuilder("<html><body><table border='1'>");

        // Header row
        htmlTable.append("<tr><th>Subject</th><th>Score</th></tr>");

        // Data rows
        for (int i = 0; i < entries.length; i++) {
            // Split each entry into tokens using the colon as a delimiter
            String[] tokens = entries[i].split(":");

            // Print the contents of the tokens array
            System.out.println("Tokens[0]:" + tokens[0]);
            System.out.println("Tokens[1]:" + tokens[1]);

            // Store subjects and scores in separate arrays
            subjects[i] = tokens[0];
            scores[i] = Integer.parseInt(tokens[1]);

            // Add a row to the HTML table for each subject and score
            htmlTable.append("<tr><td>").append(subjects[i]).append("</td><td>").append(scores[i]).append("</td></tr>");
        }

        // Close the HTML table tags
        htmlTable.append("</table></body></html>");

        // Print the intermediate state of arrays
        printArrays(subjects, scores);

        // Print the resulting HTML table as a string
        System.out.println("Final HTML Table:\n" + htmlTable.toString());
    }

    // Helper method to print the state of arrays
    private static void printArrays(String[] subjects, int[] scores) {
        System.out.println("Subjects Array:");
        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println("\nScores Array:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}


