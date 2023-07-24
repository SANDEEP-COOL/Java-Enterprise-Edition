package custometags;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.IOException;


public class TagWithBody extends SimpleTagSupport{
    
    @Override 
    public void doTag() throws JspException , IOException {

        JspFragment jf = super.getJspBody();

        // passing sw will let invoke method pass the body content to client(output stream),
        jf.invoke(null);

    }


}
