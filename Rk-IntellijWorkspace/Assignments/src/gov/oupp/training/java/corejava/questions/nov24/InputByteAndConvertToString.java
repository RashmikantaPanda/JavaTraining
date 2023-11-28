package gov.oupp.training.java.corejava.questions.nov24;

import java.io.FileOutputStream;
import java.util.Scanner;

public class InputByteAndConvertToString {
    public static void main(String[] args) {

        String filePath = "src/gov/oupp/training/java/corejava/questions/nov24/ByteInputFile.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of byte you want to enter");
            int size = sc.nextInt();
            int[] b = new int[size];
            System.out.println("Enter " + size + " bytes : ");
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }

            System.out.println("Writing content to file : ");
            for (int i = 0; i < b.length; i++) {
                char ch=(char)b[i];
                String str=String.valueOf(b);
                fos.write(str.getBytes());
            }
            fos.close();
            System.out.println("Write success");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
