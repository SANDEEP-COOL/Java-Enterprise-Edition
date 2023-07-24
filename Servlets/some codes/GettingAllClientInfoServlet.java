import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;

public class GettingAllClientInfoServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // ServletRequest interface methods 
        String remoteHost = request.getRemoteHost();
        String remoteAdd = request.getRemoteAddr();
        int contentLength = request.getContentLength();
        String protocall = request.getProtocol();
        String serverName = request.getServerName();
        int port = request.getServerPort();

        // HttpServletRequest interface provides some extra methods 
        String path = request.getServletPath();
        String method = request.getMethod();
        Enumeration<String> e = request.getHeaderNames();

        PrintWriter pw = response.getWriter();
        pw.println(


            "<table>"+
            
                "<tr>"+
                    "<td> RemoteHost :"+remoteHost+"</td>"+
                "</tr>"+

                "<tr>"+
                    "<td> RemoteAddress :"+remoteAdd+"</td>"+
                "</tr>"+
                
                "<tr>"+
                    "<td> ContentLength :"+contentLength+"</td>"+
                "</tr>"+
                
                "<tr>"+
                    "<td> Protocall :"+protocall+"</td>"+
                "</tr>"+
                
                "<tr>"+
                    "<td> ServerName :"+serverName+"</td>"+
                "</tr>"+
                
                "<tr>"+
                    "<td> Port :"+port+"</td>"+
                "</tr>"+
                
                "<tr>"+
                    "<td> ServletPath :"+path+"</td>"+
                "</tr>"+

                "<tr>"+
                    "<td> Method :"+method+"</td>"+
                "</tr>"+

            "</table>"

        );

        pw.close();

    }
    
}
