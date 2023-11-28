package gov.oupp.training.java.corejava.questions.nov24;

import java.io.FileOutputStream;
import java.io.IOException;

public class QuestionNo8 {
    public static void main(String[] args) {
        String filePath = "src/gov/oupp/training/java/corejava/questions/nov24/MyFile6Ques8.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            for (int i = 0; i < 100; i++) {
                fos.write(i);
            }
            long byteCount = fos.getChannel().size();

            System.out.println("Bytes written to " + filePath + ": " + byteCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
