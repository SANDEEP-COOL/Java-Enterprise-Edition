package custometags;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;


public class TagsWithAttribute extends SimpleTagSupport{
    
    private int rows;
    private int columns;

    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getColumns() {
        return columns;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override 
    public void doTag() throws JspException, IOException {

        JspContext jc = super.getJspContext();
        JspWriter out = jc.getOut();


        if(rows > 0 && columns > 0) {

            out.println("<table>");
            for(int i = 0 ; i < rows ; i++) {

                out.println("<tr>");
                for(int j = 0 ; j < columns ; j++) {

                    out.println("<th>"+rows+" , "+columns+"</th>");

                }   
                out.println("</tr>");

            }
            out.println("</table>");

        }
        else {
            out.println("<strong>Rows and Columns missing!</strong>");
        }

    }

}
