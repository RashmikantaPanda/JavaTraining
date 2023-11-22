package edu.oupp.training.java.corejava.junit.test;
import org.junit.Test;

import edu.oupp.training.java.corejava.junit.MessageUtil;

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
