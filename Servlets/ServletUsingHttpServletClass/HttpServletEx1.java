// IMP 
// HttpServlet class extends to GenericServlet class
// 1 HttpServlet class is used to support different types of http request 
// 2 it supports the http protocall 
// 3 we can create our class and extends to HttpServlet class and here we only need to required method like doGet, doPost, doPut 



import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;

public class HttpServletEx1 extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        Date d = new Date();
        PrintWriter pw = response.getWriter();
        pw.println(
            "<h1>"+
                "Current Date is "+d+
            "</h1>"
        );
        // pw.println(super.getServletInfo()+"*****");
        pw.close();

    }

}
