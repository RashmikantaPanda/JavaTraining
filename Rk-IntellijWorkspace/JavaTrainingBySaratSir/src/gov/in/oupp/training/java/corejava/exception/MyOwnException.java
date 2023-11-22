package gov.in.oupp.training.java.corejava.exception;

public class MyOwnException extends Exception{
    String message;
    public MyOwnException(String message){
        this.message=message;
    }

    public String toString(){
        return message;
    }
/*OR*/
    /*public MyOwnException(String message) {
        super(message);
    }*/
}

