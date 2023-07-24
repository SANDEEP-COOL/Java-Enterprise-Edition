import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class ReadingFormData extends HttpServlet {
    
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        String name = (String)request.getParameter("username");
        String age = (String)request.getParameter("age");
        String[] hobbies = request.getParameterValues("hobbies");

        PrintWriter pw = response.getWriter();

        pw.println("<h2>Welcome Dear!</h2>");
        pw.println("<strong>Your Name is : </strong>"+name);
        pw.println("<strong>Your age is : </strong>"+age);
        pw.println("<strong>Your hobbies are : ");
        for(int i = 0 ; i < hobbies.length ; i++) {
            pw.println(hobbies[i]+"</strong>");
        }

        pw.close();
    }

}
