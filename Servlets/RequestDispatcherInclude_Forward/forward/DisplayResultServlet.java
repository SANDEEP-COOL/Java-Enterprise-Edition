import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class DisplayResultServlet extends HttpServlet {

    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        Integer res = (Integer)request.getAttribute("result");
        PrintWriter pw = response.getWriter();
        pw.println("<h2>DisplayResultServlet...</h2>");
        pw.println("<p>Sum is : <strong>"+res+"</strong> from DisplayResultServlet</p>");
        pw.close();

    }

}
