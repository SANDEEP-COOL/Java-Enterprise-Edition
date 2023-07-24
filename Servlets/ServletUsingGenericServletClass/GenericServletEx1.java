import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class GenericServletEx1 extends GenericServlet {
    
    // override - service() 
    public void service (ServletRequest request, ServletResponse response) throws IOException{

        // response format 
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
            pw.println("<head></head>");
            pw.println("<body>");
                pw.println("<h1>Welcome to Servlet</h1>");
            pw.println("</body>");
        pw.println("</html>");

        pw.close();
    }

}
