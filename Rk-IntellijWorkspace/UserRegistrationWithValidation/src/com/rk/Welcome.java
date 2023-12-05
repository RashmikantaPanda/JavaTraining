package com.rk;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Welcome extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("user");

//		out.print("Login Success");
        out.print("Welcome "+username);
        out.println("<br><br><a href='index.html'>Home</a>");
    }

}
