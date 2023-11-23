package gov.in.oupp.training.java.corejava.io.example2;

import java.io.File;
import java.io.FileWriter;

public class FileCreationUisngChar {
    public static void main(String[] args) {
        String filePath = "src/gov/in/oupp/training/java/corejava/io/example2/SecondFile.txt";

        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created : " + file.getAbsolutePath());
            } else {
                System.out.println("File Already Exist");
            }
            try (FileWriter writer = new FileWriter(file)) {
                String data = "Hello Rashmikanta";
                writer.write(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
