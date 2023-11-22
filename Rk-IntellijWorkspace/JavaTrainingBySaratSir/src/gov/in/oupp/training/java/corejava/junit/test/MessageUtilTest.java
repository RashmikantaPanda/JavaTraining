package gov.in.oupp.training.java.corejava.junit.test;

import gov.in.oupp.training.java.corejava.junit.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageUtilTest {
    String message="Rashmikanta";
    MessageUtil messageUtil=new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        assertEquals(message,messageUtil.printMessage());
    }
}
