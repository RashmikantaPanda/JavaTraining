package gov.oupp.training.java.corejava.questions.nov24;

import java.io.*;

public class MergeTwoFile {
    public static void main(String[] args) {
        String sourceFilePath1 = "src/gov/oupp/training/java/corejava/questions/nov24/MyFile1.txt";
        String sourceFilePath2 = "src/gov/oupp/training/java/corejava/questions/nov24/MyFile2.txt";
        String targetFilePath = "src/gov/oupp/training/java/corejava/questions/nov24/MergeTwoFile.txt";

        File sourceFile1 = new File(sourceFilePath1);
        File sourceFile2 = new File(sourceFilePath2);
        File targetFile = new File(targetFilePath);

        try {
            try (BufferedReader reader1 = new BufferedReader(new FileReader(sourceFile1));
                 BufferedReader reader2 = new BufferedReader(new FileReader(sourceFile2));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {
                String line;
                /*Writing the content of first file to the target file*/
                while ((line = reader1.readLine()) != null) {
                    System.out.println(line);
                    writer.write(line);
                    writer.newLine();
                }

                /*Writing the content of second file to the target file*/
                while((line=reader2.readLine())!=null){
                    System.out.println(line);
                    writer.write(line);
                    writer.newLine();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
