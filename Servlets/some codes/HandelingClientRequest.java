import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;

public class HandelingClientRequest extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {

        String name = request.getParameter("name");
        PrintWriter pw = response.getWriter();
        pw.println("<h2>"+
        
                        "Fetching name from servlet : "+name+

                    "</h2>");

        pw.close();
    }
 
}
