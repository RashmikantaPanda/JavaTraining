package gov.in.oupp.training.java.corejava.exception.banking;

import gov.in.oupp.training.java.corejava.exception.flightbooking.InsufficientFundException;

public class BankingSystem {
    public static void main(String[] args) {
        try{
            withdrawMoney("Tarinee Prasad Panda","07370101",5000,6000);
        }
        catch (InsufficientFundException e){
            System.err.println("Insufficient fund ! You don't have sufficient balance to withdraw");
        }

    }

    private static void withdrawMoney(String accHolderName, String accNo, int availableBalance, int withdrawAmount) throws InsufficientFundException{
        if(withdrawAmount > availableBalance){
            throw new InsufficientFundException("Insufficient balance ! Withdraw can not be possible");
        }
    }
}
