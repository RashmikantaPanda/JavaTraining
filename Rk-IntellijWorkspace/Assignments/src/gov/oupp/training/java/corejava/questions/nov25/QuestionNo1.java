package gov.oupp.training.java.corejava.questions.nov25;

public class QuestionNo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr1 = new Address("Balia", "Kendrapara");
        Student s1 = new Student(100, "RK Panda", addr1);

        Student s2= (Student) s1.clone();
        System.out.println("Original Student : "+s1);
        System.out.println("Cloned Student : "+s2);

    }
}
