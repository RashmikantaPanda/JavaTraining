package edu.oupp.training.java.corejava.jdbc;
import java.sql.*;

public class CallableStatementTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ouppdb";
        String username = "root";
        String password = "root";

        try{
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");
            CallableStatement callStmt=con.prepareCall("{call getAllStudents()}");
            ResultSet rs=callStmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
            }
            System.out.println("Success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
