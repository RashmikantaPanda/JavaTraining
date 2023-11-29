package gov.in.oupp.training.java.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ouppdb";
        String username = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            con.setAutoCommit(false);
            try {
                //Perform a transaction
                transferMoney(con, 1, 2, 500.00);
                //Commit the transaction
                con.commit();
                System.out.println("Transaction Commited Successfully");
            } catch (SQLException e) {
                //Rollback the transaction
                con.rollback();
                System.out.println("Transaction rolled back due to an exception");
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void transferMoney(Connection con, int fromAccNo, int toAccNo, double amount) throws SQLException {
        //Deduct money from source account
        updateAccountBalance(con,fromAccNo,-amount);
        //Add money to the target account
        updateAccountBalance(con,toAccNo,amount);
    }

    private static void updateAccountBalance(Connection con, int accNo, double amount) throws SQLException {
        String sql= "Update bank_account Set balance= "+" balance + ? WHERE accNo= ? ;";

        try(PreparedStatement pst=con.prepareStatement(sql)){
            pst.setDouble(1,amount);
            pst.setInt(2,accNo);
            pst.executeUpdate();
        }
    }
}
