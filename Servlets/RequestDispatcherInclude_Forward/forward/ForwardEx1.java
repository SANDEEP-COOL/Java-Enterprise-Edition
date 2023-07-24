import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
import java.io.IOException;

public class ForwardEx1 extends HttpServlet {

    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {

        String num1 = request.getParameter("num1");
        String  num2 = request.getParameter("num2");
        
        PrintWriter pw = response.getWriter();

        try{

            Integer a = Integer.parseInt(num1);
            Integer b = Integer.parseInt(num2);

            int res = a + b;

            RequestDispatcher rd = request.getRequestDispatcher("DisplayResultServlet");

            request.setAttribute("result", res);

            pw.println("<p>final response from ForwardEx1</p>");

            rd.forward(request, response);


        }
        catch(NumberFormatException nfm) {
            pw.println("<p>Please Input <strong> Integers </strong> only from ForwardEx1</p>");
            pw.close();
        }

    }

}
