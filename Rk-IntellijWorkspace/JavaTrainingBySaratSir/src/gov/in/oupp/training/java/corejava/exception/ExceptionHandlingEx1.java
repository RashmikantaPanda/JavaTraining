package gov.in.oupp.training.java.corejava.exception;

public class ExceptionHandlingEx1 {
    public static void main(String[] args) {
        int data;
        try{
            data=100/0;
        } catch (ArithmeticException a) {
            System.out.println(a);
        }

    }
}
