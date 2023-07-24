import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
import java.io.IOException;

public class IncludeEx1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<p>Response from <strong>IncludeEx1</strong> servlet...</p>");
        RequestDispatcher rd = request.getRequestDispatcher("AddMoreContentServlet");
        rd.include(request, response);
        pw.close();

    }

}