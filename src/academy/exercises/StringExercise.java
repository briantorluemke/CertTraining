package academy.exercises;
import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String userInput = sc.nextLine();

        String[] words = userInput.split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
