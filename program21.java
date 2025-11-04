import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        countWordFrequency(sentence);
    }

    public static void countWordFrequency(String sentence) {
        // Convert to lowercase and split by spaces or punctuation
        String[] words = sentence.toLowerCase().split("[\\s.,!?;:()]+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
