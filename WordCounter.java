import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get the sentence input from the user
        String sentence = getSentenceInput(scanner);
        
        // Count the words in the entered sentence
        int wordCount = countWords(sentence);
        
        // Display the word count
        System.out.println("The sentence has " + wordCount + " words.");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to get a sentence input from the user
    public static String getSentenceInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Read the entire line as the sentence
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split("\\s+"); // \\s+ means one or more spaces
        
        // Return the length of the resulting array (which is the word count)
        return words.length;
    }
}
