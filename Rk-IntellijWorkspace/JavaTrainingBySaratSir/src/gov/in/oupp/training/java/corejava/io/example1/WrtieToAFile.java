package gov.in.oupp.training.java.corejava.io.example1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WrtieToAFile {
    public static void main(String[] args){
        try {
            FileOutputStream fout = new FileOutputStream("./src/gov/in/oupp/training/java/corejava/io/example1/MyFile1.txt");
            System.out.println("Writing byte stream to file MyFile1.txt");
            fout.write(20);
            fout.close();
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println(e);
        }

        /*Writing content to MyFile2.txt */
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("./src/gov/in/oupp/training/java/corejava/io/example1/MyFile2.txt");
            String str="HI My name is Rashmikanta Panda";
            byte b[]=str.getBytes();
            System.out.println("Writing content to file MyFile2.txt");
            fileOutputStream.write(b);
            fileOutputStream.close();
            System.out.println("File2 success");

        }
        catch (Exception e){
            System.out.println(e);
        }

        /*Reading content from MyFile2.txt and show it in the console*/
        try{
            File file=new File("./src/gov/in/oupp/training/java/corejava/io/example1/MyFile2.txt");
            Scanner sc=new Scanner(file);
            System.out.println("Reading content from file MyFile2.txt");
            while(sc.hasNextLine()){
                String str=sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
