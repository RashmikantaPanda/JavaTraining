package gov.in.oupp.training.java.corejava.io.example2;

import java.io.*;

public class FileReadingUsingStream {
    public static void main(String[] args) {
        String filePath = "src/gov/in/oupp/training/java/corejava/io/example2/SecondFile.txt";

        File file=new File(filePath);

        try {
            try (FileInputStream fis=new FileInputStream(file)){
                /*Create a byte array to store the read data*/
                byte[] data=new byte[(int)file.length()];
                /*Read data from the file into the byte array*/
                fis.read(data);

                String fileContent=new String(data);
                System.out.println("File contents : \n"+fileContent);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
