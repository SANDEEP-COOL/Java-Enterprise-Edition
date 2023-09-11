// However the implementation of JspWriter, JspFragment and JspContext etc... is provided by container at run time

// SimpleTagSupport class - provided several methods to create custom tags and access Jsp 
// JspContext abstract class - used for accessing enviorment and various componants of jsp 
// JspWriter abstract class - used for accessing outputStream for writing output to client while reponding from jsp to client 
// JspFragment abstract class - used for accessing jsp body of jsp 
 
// JspException class - forException  

package custometags;

// for SimpleTagSupport class and JspException class
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;

// for JspContext abstract class and JspWriter abstract class 
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;

import java.io.IOException;
import java.util.Date;

public class CurrentDateTag extends SimpleTagSupport {

    // let's say container jsp page ko execute kar raha h, use process kar ra hai,
    // to jaise hi container custom tag ko encounter karega,
    // tabhi vo SimpleTagSupport ki setJspContext() ko call karega so that JspContext ka object ban jaaye,
    // then container tags ke setters call karga , if they are... ,
    // then container setJspBody() call karega if body is availible and will return us JspFragment Object... ,
    // then container doTag() ko call karega

    @Override 
    public void doTag() throws JspException, IOException{

        JspContext context = super.getJspContext();
        JspWriter out = context.getOut();
        out.println("<h1>This is a simple jsp custome tag Example , Date - "+new Date()+"...</h1>");

    }

}


