package edu.oupp.training.java.corejava.io;
import java.io.*;

public class SerializationWrtInheritance {
    public static void main(String[] args) throws Exception {
        String filePath= "./src/edu/oupp/training/java/corejava/io/rkp.ser";

        Employee employee1= new Employee();
        System.out.println(employee1.i+" ----- "+employee1.j);
        FileOutputStream fos=new FileOutputStream(filePath);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(employee1);

        FileInputStream fis=new FileInputStream(filePath);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee employee2= (Employee) ois.readObject();
        System.out.println(employee2.i+" "+employee2.j);

    }
}
