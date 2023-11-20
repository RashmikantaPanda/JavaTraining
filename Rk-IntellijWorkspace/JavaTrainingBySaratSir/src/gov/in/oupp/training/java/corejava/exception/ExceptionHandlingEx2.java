package gov.in.oupp.training.java.corejava.exception;

public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        try {
            System.out.println(10 / 0);
        } catch (NullPointerException e) {
            System.out.println("Nullpointer exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally block will always called");
        }
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");


    }
}
