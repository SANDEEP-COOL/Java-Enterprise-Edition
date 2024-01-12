package fetch_info;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.io.IOException;

public class FetchClientInfoServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        String clientName = request.getRemoteHost();
        String clientIp = request.getRemoteAddr();
        pw.println("<p>ClientName : "+clientName+" and ClientIp : "+clientIp+"</p>");
        Enumeration<String> en = request.getHeaderNames(); 
        while(en.hasMoreElements()) {
            String headerName = (String)en.nextElement();
            String headerValue = request.getHeader(headerName);
            pw.println("<p>headerName : "+headerName+" and headerValue : "+headerValue+"</p>");
        }
        
        int contentLength = request.getContentLength();
        String protocall = request.getProtocol();
        String serverName = request.getServerName();
        int serverPort = request.getServerPort();
        String servletPath = request.getServletPath();
        String method = request.getMethod();
        pw.println("<p>contentLength : "+contentLength+" and protocall : "+protocall+" and serverName :"+serverName+"</p>");
        pw.println("serverPort : "+serverPort+" and servletPath : "+servletPath+" method : "+method);

    }

}
