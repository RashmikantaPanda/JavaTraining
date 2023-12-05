package com.rk;

import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String regdno = request.getParameter("regdno");
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (validate(out, regdno, fullname, email, password)) {
            try {
                DbConnection connection = new DbConnection();
                PreparedStatement pst = connection.con.prepareStatement("insert into signup (regdno,fullName,email,password) values (?,?,?,?);");
                pst.setString(1, regdno);
                pst.setString(2, fullname);
                pst.setString(3, email);
                pst.setString(4, password);

                int status = pst.executeUpdate();
                if (status > 0) {
                    System.out.println("Registration Successful");
                    out.print("Registration Successful");
                    out.println("<br><br><a class=\"text-decoration-none fs-5 \" href=\"login.html\">Click Here for LOGIN</a>");
                }
                else {
                    out.println("Something went wrong");
                    System.out.println("Something went wrong");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            RequestDispatcher rd=request.getRequestDispatcher("registration.html");
            rd.include(request, response);
        }

    }

    private boolean validate(PrintWriter out, String regdno, String fullname, String email, String password) {

        if (regdno == null) {
            out.println("<h4>Registration no. can not be empty</h4>");
            return false;
        }
        if (fullname == null) {
            out.println("<h4>FullName can not be empty</h4>");
            return false;
        }
        if (email == null) {
            out.println("<h4>Email can not be empty</h4>");
            return false;
        }
        if (password == null) {
            out.println("<h4>Password can not be empty</h4>");
            return false;
        }

        if (password.length() < 8) {
            out.println(" <h4>Password should contain atleast 8 characters</h4>");
            return false;
        }
        for (char c : regdno.toCharArray()) {
            if (!Character.isDigit(c)) {
                out.println("<h4>Registration no should contain only numbers</h4>");
                return false;
            }
        }

        try {
            DbConnection connection = new DbConnection();
            String query = "select * from signup where regdno = ? ;";
            PreparedStatement pst = connection.con.prepareStatement(query);
            pst.setString(1, regdno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Registration no is already exist");
                out.println("User id already registered");
                return false;
            }

            String query2 = "select * from signup where email = ? ;";
            PreparedStatement pst2 = connection.con.prepareStatement(query2);
            pst2.setString(1, email);
            ResultSet rs2 = pst2.executeQuery();
            if (rs2.next()) {
                System.out.println("Email is already exist");
                out.println("Email Id Already registered,Please enter a new email");
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

}
