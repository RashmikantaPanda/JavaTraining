package edu.oupp.training.java.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ouppdb";
		String username="root";
		String password="root";
		
		try{
			System.out.println("Driver Loaded");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
