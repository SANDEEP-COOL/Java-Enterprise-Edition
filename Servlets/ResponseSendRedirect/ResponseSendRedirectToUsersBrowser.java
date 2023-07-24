import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class ResponseSendRedirectToUsersBrowser extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {

        String userAgent = request.getHeader("user-agent");
        if(userAgent.indexOf("Chrome") != -1) {
            
            // kill the current request processing cycle,
            response.sendRedirect("http://www.chrome.com");

        }
        else if(userAgent.indexOf("Firefox") != -1) {

            response.sendRedirect("http://www.mozila.com");

        }
    }

}
