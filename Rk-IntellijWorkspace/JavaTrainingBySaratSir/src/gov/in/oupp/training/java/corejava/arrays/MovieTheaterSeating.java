package gov.in.oupp.training.java.corejava.arrays;

import java.util.Scanner;

public class MovieTheaterSeating {
    private static char[][] seats;
    private static int rows;
    private static int columns;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------MAHARAJA PICTURE SHOW-----------");
        System.out.println("Enter the no of rows in the theater : ");
        rows = sc.nextInt();
        System.out.println("Enter the no of columns in the theater: ");
        columns = sc.nextInt();

        initializeTheater(rows, columns);
        displaySeatingLayout();
        System.out.println("Enter the seat you want to book ?");
        int seatRow,seatColumn;
        seatRow=sc.nextInt();
        seatColumn=sc.nextInt();
        bookSeat(seatRow,seatColumn);
    }

    private static void bookSeat(int seatRow, int seatColumn) {
        if(seatRow>rows || seatColumn>columns){
            throw new IllegalArgumentException("Invalid seat position");
        }
        if(seats[seatRow][seatColumn]!='0'){
            throw new IllegalArgumentException("Seat is booked");
        }
        seats[seatRow][seatColumn]='1';
        System.out.println("Seat no ["+seatRow+"]["+seatColumn+"] is booked");
        displaySeatingLayout();
    }

    private static void displaySeatingLayout() {
        System.out.println("Seat Details : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initializeTheater(int rows, int columns) {
        seats = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
             seats[i][j]='0';
            }
        }
    }
}
