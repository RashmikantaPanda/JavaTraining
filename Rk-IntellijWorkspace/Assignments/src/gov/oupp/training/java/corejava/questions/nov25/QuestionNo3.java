package gov.oupp.training.java.corejava.questions.nov25;


public class QuestionNo3 {
    public static void main(String[] args) {
        Address addr1 = new Address("Balia", "Kendrapara");
        Student s1 = new Student(100, "RK Panda", addr1);

        Student s2 = new Student(s1.getId(), s1.getName(), new Address(s1.getAddress().getStreet(), s1.getAddress().getCity()));
        System.out.println("Original Student : "+s1);
        System.out.println("Cloned Student : "+s2);
    }
}
