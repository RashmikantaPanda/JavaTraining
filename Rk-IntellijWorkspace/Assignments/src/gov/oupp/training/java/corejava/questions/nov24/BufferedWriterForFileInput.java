package gov.oupp.training.java.corejava.questions.nov24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class BufferedWriterForFileInput {
    public static void main(String[] args) {
        String filePath = "./src/gov/oupp/training/java/corejava/questions/nov24/MyFile3.txt";

        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created : " + file.getName());
            } else {
                System.out.println("File Already Exist");
            }
            try (BufferedWriter writer=new BufferedWriter(new FileWriter(file))){
                String data="Hello My Name is Rashmikanta Panda\nI am a trainee at OUPP, Keonjhar";
                writer.write(data);
                System.out.println(data+" successfully written to the file "+file.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
