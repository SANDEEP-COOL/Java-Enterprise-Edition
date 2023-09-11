// IMP
// 1 GenericServlet is an abstract class 
// 2 it is an Abstract class
// 3 GenericServlet class implements to Servlet Interface 
// 4 GenericServlet class overrides 4 methods of Servlet Interface 
// 5 it has only abstract method which is service()
// 6 We can create our own class and extends to GenericServlet 
// 7 So we will have to override only One method
// 8 It doesn't support the different types of HTTP request it only supports generalized request



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
