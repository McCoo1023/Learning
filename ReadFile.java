package forfun;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFile {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:/Users/OCapak/Desktop/JavaTest.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            List<String> words = new ArrayList<>();

            for (String line : lines) {
                String[] wordsInLine = line.split("\\s+"); // Split line into words, splitting by any whitespace
                for (String word : wordsInLine) {
                    if (!word.isEmpty()) { // Add non-empty words to the list
                        words.add(word);
                    }
                }
            }

            Collections.sort(words); // Sort the words alphabetically

            for (String word : words) {
                System.out.println(word); // Print each word on a new line
            }

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
