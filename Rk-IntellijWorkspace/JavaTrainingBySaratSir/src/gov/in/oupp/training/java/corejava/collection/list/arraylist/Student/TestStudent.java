package gov.in.oupp.training.java.corejava.collection.list.arraylist.Student;

import java.util.ArrayList;

public class TestStudent{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student student1=new Student(100,"Rk Panda","rkpanda123@gmail.com","Rkp@123","123456789");
        list.add(student1);
//        Or
        list.add(new Student(101,"JB Pradhan","jbpradhan@gmail.com","Jyoti@123","987654321"));

        System.out.println(list);
    }
}
