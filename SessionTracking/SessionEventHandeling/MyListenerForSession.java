package SessionTracking.SessionEventHandeling;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;

public class MyListenerForSession implements HttpSessionListener {

    public static int count;

    @Override 
    public void sessionCreated(HttpSessionEvent e) {
        ++count;
    }
 
    @Override
    public void sessionDestroyed(HttpSessionEvent e) {
        --count;
    }
}
