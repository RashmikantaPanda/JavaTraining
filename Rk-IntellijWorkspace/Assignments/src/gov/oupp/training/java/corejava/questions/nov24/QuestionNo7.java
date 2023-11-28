package gov.oupp.training.java.corejava.questions.nov24;

import java.io.*;
import java.util.ArrayList;

public class QuestionNo7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath="./src/gov/oupp/training/java/corejava/questions/nov24/MyFile5Ques7.txt";

        Student student1=new Student(1,"RK Panda",23);
        Student student2=new Student(2,"TP Panda",25);
        Student student3=new Student(3,"JB Pradhan",23);

        ArrayList<Student> studList=new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);

        System.out.println("Serialization Started");
        FileOutputStream fos=new FileOutputStream(filePath);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(studList);
        for(Student s:studList){
            System.out.println(s.getAge()+" "+s.getName()+" "+s.getAge());
        }
        System.out.println("Serialization Done");

        System.out.println("Deserialization Started");
        FileInputStream fis=new FileInputStream(filePath);
        ObjectInputStream ois=new ObjectInputStream(fis);

        ArrayList<Student> studList2= (ArrayList<Student>) ois.readObject();
        for(Student s:studList2){
            System.out.println(s.getAge()+" "+s.getName()+" "+s.getAge());
        }
        System.out.println("Deserialization Done");

    }
}
