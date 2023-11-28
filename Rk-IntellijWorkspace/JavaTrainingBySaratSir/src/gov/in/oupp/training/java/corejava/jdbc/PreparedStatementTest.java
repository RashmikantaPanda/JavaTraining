package gov.in.oupp.training.java.corejava.jdbc;

import java.sql.*;

public class PreparedStatementTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ouppdb";
        String username = "root";
        String password = "root";

        try {
            System.out.println("Driver Loaded");
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");
/* Inserting a record
            PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?);");
            ps.setInt(1, 106);
            ps.setString(2, "Debasis Biswal");
            ps.setInt(3,24);

            int count=ps.executeUpdate();
            System.out.println(count+" rows inserted");
*/

/*Updating a record
            PreparedStatement ps = con.prepareStatement("update student set name= ? where id= ?;");
            ps.setString(1, "Priyaranjan Mallick");
            ps.setInt(2,106);

            int count=ps.executeUpdate();
            System.out.println(count+" records updated");
*/

/*Deleting a Record
            PreparedStatement ps = con.prepareStatement("delete from student where id= ?;");
            ps.setInt(1,106);

            int count=ps.executeUpdate();
            System.out.println(count+" records deleted");
*/

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
