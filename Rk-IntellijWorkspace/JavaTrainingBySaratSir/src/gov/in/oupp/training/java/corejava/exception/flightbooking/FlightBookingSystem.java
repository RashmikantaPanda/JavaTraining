package gov.in.oupp.training.java.corejava.exception.flightbooking;


public class FlightBookingSystem {
    public static void main(String[] args){
        try{
            bookFlights("Tarini Panda",12566,9);
        }
        catch (NetworkConnectException e){
            System.err.println("Unable to connect to the flight booking server");
        }
        catch (InvalidInputException e){
            System.err.println("Invalid input . Plz Enter valid number of passenger");
        }
        catch (SeatReservationException e){
            System.err.println("You can book only 10 seats per passenger");
        }
        catch (InsufficientFundException e){
            System.err.println("Insufficient fund !");
        }
    }

    private static void bookFlights(String passengerName, Integer accBalance, int noOfPassengers)
            throws NetworkConnectException, InvalidInputException, SeatReservationException, InsufficientFundException {
        if(noOfPassengers < 1){
            throw new InvalidInputException("Invalid Input. Plz enter valid no of passenger");
        }
        if(noOfPassengers > 10){
            throw new SeatReservationException("Invalid Input. You can only book 10 seats per passenger");
        }
        if(accBalance < (noOfPassengers*5000)){
            throw new InsufficientFundException("Low Balance ! Ticket can't be booked");
        }
        System.out.println("Dear "+passengerName+" your ticket booked successfully");
    }
}
