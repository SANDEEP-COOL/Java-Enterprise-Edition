import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class ReadingContextParameter extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        ServletContext sc = super.getServletContext();
        String name = sc.getInitParameter("name");
        pw.println("<p>you name is : <strong>"+name+" </strong></p>");

    }

}
