package custometags;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.IOException;
import java.io.StringWriter;

public class ManipulatingBody extends SimpleTagSupport {
    
    @Override 
    public void doTag() throws JspException, IOException {

        JspFragment jf = super.getJspBody();
        StringWriter sw = new StringWriter();

        // passing sw will not let invoke method pass the body content to client(output stream),
        // it will pass body to StringWriter object 
        jf.invoke(sw);
        String str = sw.toString();

        str = str.toUpperCase();

        JspContext jc = super.getJspContext();
        JspWriter out = jc.getOut();


        out.println(str);
    }

}
