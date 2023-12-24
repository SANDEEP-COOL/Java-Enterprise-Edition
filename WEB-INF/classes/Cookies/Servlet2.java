package Cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        boolean flag = false;
        String name = "";

        Cookie c[] = request.getCookies();
        

        if(c == null) {

            out.println("<h1>Hello Dear , you are new user");
            return;

        }

        else {

            for(Cookie cookie : c) {
                String key = cookie.getName();
                if(key.equals("name")) {

                    name = cookie.getValue();
                    flag = true;

                }
            } 

            if(flag == true) {
                out.println("<h1>Hello"+name+" Welcome back</h1>");
            }

            else {
                out.println("<h1>Hello Dear , you are new user");
                return;
            }

        }

    }
}