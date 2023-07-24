import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;

public class HandelingServletContextEvent extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        ServletContext sc = super.getServletContext();
        Date d = (Date)sc.getAttribute("today");
        pw.println("<p>Date <strong>"+d+" </strong>took from MyListener</p>");
        pw.close();

    }

}
