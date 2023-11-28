package edu.oupp.training.java.corejava.io;
import java.io.*;

public class FileReadingUsingBufferedReader {
    public static void main(String[] args) {
        String filePath = "./src/edu/oupp/training/java/corejava/io/SecondFile.txt";

        File file = new File(filePath);

        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
