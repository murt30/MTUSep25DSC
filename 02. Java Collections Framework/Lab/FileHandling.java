import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "/workspace/MTUSep24DSC/02. Java Collections Framework/Lab/hamlet.txt";

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("Words in the file:");
            int lineNumber = 0;
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNumber++;
                // Use regex to split on non-word characters (e.g., punctuation, whitespace)
                String[] words = line.split("[^A-Za-z0-9]+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        System.out.println(word + "\tLine " + lineNumber +  "\n");
                    }
                }
            }
            

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            e.printStackTrace();
        }

    }
}

