package gov.oupp.training.java.corejava.questions.nov24;

import java.io.*;

public class CopyOneFileToAnother {
    public static void main(String[] args) {
        String sourceFilePath = "src/gov/oupp/training/java/corejava/questions/nov24/MyFile1.txt";
        String targetFilePath = "src/gov/oupp/training/java/corejava/questions/nov24/MyFile2.txt";

        File sourceFile = new File(sourceFilePath);
        File targetFile = new File(targetFilePath);

        /*Method 1*/
       /* try (FileInputStream fis = new FileInputStream(sourceFile)) {
            byte[] data = new byte[(int) sourceFile.length()];
            fis.read(data);
            String fileContent = new String(data);
            try (FileOutputStream fos = new FileOutputStream(targetFile)) {
                fos.write(fileContent.getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        /*Method 2*/
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
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
