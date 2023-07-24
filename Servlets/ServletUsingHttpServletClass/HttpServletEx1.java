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
        pw.close();

    }

}
