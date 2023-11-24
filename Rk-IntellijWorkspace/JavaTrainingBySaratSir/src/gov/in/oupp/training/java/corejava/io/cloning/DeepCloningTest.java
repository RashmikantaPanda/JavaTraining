package gov.in.oupp.training.java.corejava.io.cloning;

public class DeepCloningTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address oriAddress = new Address("Samsundarpur", "Kendrapara");
        Student oriStudent = new Student(1, "RK Panda", oriAddress);

        Student clonedStudent = new Student(oriStudent.getId(), oriStudent.getName(), new Address(oriStudent.getAddress()
                .getStreet(), oriStudent.getAddress()
                .getCity()));

        System.out.println("Original : " + oriStudent);
        System.out.println("Deep Clone : " + clonedStudent);

        /*Modify the address in clone*/
        clonedStudent.getAddress().setCity("BBSR");
        System.out.println("After changing city in clone object");

        /*Here, Both original and clone are affected*/
        System.out.println("Original : " + oriStudent);
        System.out.println("Deep Clone : " + clonedStudent);
    }
}
