import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContext;
import java.util.Date;

public class MyListener implements ServletContextListener {
    
    @Override 
    public void contextInitialized(ServletContextEvent e) {

        System.out.println("context initialized runs...");
        ServletContext sc = e.getServletContext();
        Date d = new Date();
        sc.setAttribute("today", d);

    }

    @Override
    public void contextDestroyed(ServletContextEvent e) {

        System.out.println("contextDestroyed runs...");
        
    }
}
