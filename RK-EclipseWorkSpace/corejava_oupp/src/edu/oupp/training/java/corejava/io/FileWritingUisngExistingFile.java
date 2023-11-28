package edu.oupp.training.java.corejava.io;
import java.io.File;
import java.io.FileOutputStream;

public class FileWritingUisngExistingFile {
    public static void main(String[] args) {
       String filePath= "./src/edu/oupp/training/java/corejava/io/SecondFile.txt";

       File file=new File(filePath);
       try{
           try (FileOutputStream fos=new FileOutputStream(file,true)){
               String data="Hello I am writing data to existing file";
               fos.write(data.getBytes());

               System.out.println("Data Appended to the file : "+file.getName());
           }
           catch (Exception e){
               e.printStackTrace();
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
