import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class ReadingInitParameter extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        ServletConfig sc = super.getServletConfig();
        String email = sc.getInitParameter("email");
        pw.println("<p>your email id is : <strong>"+email+" </strong></p>");
        pw.close();

    }

}
