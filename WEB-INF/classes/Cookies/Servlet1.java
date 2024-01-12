package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class Servlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        System.out.println("name : "+name);
        if(name.length() != 0) {

            Cookie c = new Cookie("name" , name);
            response.addCookie(c);

            out.println("<h1>Hello "+name+" Welcome to our website</h1>");
            out.println("<a href='servlet2'>Go Next</a>");
        }
        else{
            out.println("<h1>Dear User Go back and enter your name again</h1>");
            out.println("<a href='index.jsp'>Click Here</a>");
        }
    }
}