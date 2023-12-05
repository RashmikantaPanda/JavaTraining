package com.rk;

import java.sql.*;

public class DbConnection {
    Connection con ;
    Statement st;
    public DbConnection() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
