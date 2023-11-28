package gov.oupp.training.java.corejava.questions.nov24;
/*Write a java program that creates a new object,
 serializes it to a file, and then deserializes it from the file
 and prints its contents to the console.
 */

import java.io.*;

public class QuestionNo6 {
    public static void main(String[] args) throws Exception {
        String filePath="./src/gov/oupp/training/java/corejava/questions/nov24/MyFile4.txt";

        Student student1=new Student(1,"RKPanda",23);
        System.out.println("Serialization Started");
        FileOutputStream fos=new FileOutputStream(filePath);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(student1);
        System.out.println("Serialization Done");

        System.out.println("Deserialization Started");
        FileInputStream fis=new FileInputStream(filePath);
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student student2= (Student) ois.readObject();
        System.out.println(student2.getId()+" "+student2.getName()+" "+student2.getAge());
        System.out.println("Deserialization Done");

    }
}
