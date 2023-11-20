package gov.in.oupp.training.java.corejava.exception;

public class ThrowExample {
    public static void vote(int age) throws Exception {
        if(age < 18){
            throw new Exception("You age underage for voting");
        }
        else {
            System.out.println("You are eligible for voting");
        }
    }

    public static void main1() throws InterruptedException {
        System.out.println("A");
        Thread.sleep(1000);
        System.out.println("B");
        Thread.sleep(2000);
        System.out.println("C");
    }

    public static void main(String[] args) throws Exception {
        vote(19);
//        vote(15);

        main1();

    }


}
