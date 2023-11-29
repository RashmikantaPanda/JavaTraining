package edu.oupp.training.java.corejava.jdbc;
import java.sql.*;

public class ResultsetMetadataTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ouppdb";
        String username = "root";
        String password = "root";

        try {
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");

            PreparedStatement ps=con.prepareStatement("select * from student ;");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();

            System.out.println("Total Colums : "+rsmd.getColumnCount());
            System.out.println("1st column name: "+rsmd.getColumnName(1));
            System.out.println("2nd column name: "+rsmd.getColumnName(2));
            System.out.println("3rd column name: "+rsmd.getColumnName(3));
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
