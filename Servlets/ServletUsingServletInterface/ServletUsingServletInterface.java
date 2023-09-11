import javax.servlet.Servlet;

// ServletConfig means ServletConfiguration,
// ServletConfig is an Interface used by servlet container to pass information to servlet during intialization
// information related to servlet
import javax.servlet.ServletConfig;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;


public class ServletUsingServletInterface implements Servlet {

    // Servlet interface contains total 5 methods,
    // 3 are life cycle methods of servlet,
    // 2 are non life cycle methods(used for getting information parameter or servlet)

    ServletConfig sc = null;

    public void init(ServletConfig sc) {

        this.sc = sc;
        System.out.println("creating object...");

    }

    // ServletRequest is an Interface defined to pass client request information to servlet,
    // Servlet container creates an object of ServletRequest interface,
    // and Servlet Container paasses this as argument for service()
    public void service(ServletRequest request, ServletResponse response) throws ServletException ,IOException{

        System.out.println("servicing");

    }

    public void destroy() {
        System.out.println("destroying");
    }

    // non-lifecycle method 

    public String getServletInfo() {
        return "this servlet is created by sandeep patel";
    }

    @Override
    public ServletConfig getServletConfig() {
        return sc;
    }
}