import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {

    public static int countWords(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text);
        return tokenizer.countTokens();
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Intellij Idea Project Directory\\Java Codsoft Internship Projects\\JavaProject2\\About me.docx")); // Provide the file name

            StringBuilder text = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }
            reader.close();

            // Count the words in the text
            int wordCount = countWords(text.toString());

            System.out.println("Total words: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
