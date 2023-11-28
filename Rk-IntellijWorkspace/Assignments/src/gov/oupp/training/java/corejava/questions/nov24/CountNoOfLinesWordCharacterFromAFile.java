package gov.oupp.training.java.corejava.questions.nov24;

import java.io.*;

public class CountNoOfLinesWordCharacterFromAFile {
    public static void main(String[] args) {
        String filePath="src/gov/oupp/training/java/corejava/questions/nov24/MyFile1.txt";
        File file=new File(filePath);
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            int lineCount=0;
            int wordCount=0;
            long characterCount=0;

            String line;
            while((line=br.readLine())!=null){
                lineCount++;
                String[] word=line.split(" ");
                wordCount+=word.length;
                characterCount+=line.length();
            }
//            characterCount=file.length();

            System.out.println("Total No of Lines : "+lineCount);
            System.out.println("Total No of Words : "+wordCount);
            System.out.println("Total No of Characters : "+characterCount);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
