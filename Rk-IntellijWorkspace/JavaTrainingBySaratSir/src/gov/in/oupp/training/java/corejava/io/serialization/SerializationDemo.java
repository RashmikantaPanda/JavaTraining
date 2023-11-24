package gov.in.oupp.training.java.corejava.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        String filePath="./src/gov/in/oupp/training/java/corejava/io/serialization/rkp.ser";

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
