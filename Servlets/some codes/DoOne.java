import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DoOne extends HttpServlet{

    @Override 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("come in");

    }
    
}
