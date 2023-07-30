
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;

public class SearchingBookControllerServlet extends HttpServlet{

    @Override 
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

        String subject = request.getParameter("name");
        if(subject.isEmpty()) {

            response.sendRedirect("showerror.html"); 

        }

        else {

            List<Book> bookList = BookDao.getAllBooks(subject);
            if(bookList.isEmpty()) {

                RequestDispatcher rd = request.getRequestDispatcher("nobooks.jsp");
                request.setAttribute("booname", subject);
                rd.forward(request, response);

            }
            else {

                RequestDispatcher rd = request.getRequestDispatcher("showbooks.jsp");
                request.setAttribute("booname", subject);
                request.setAttribute("booklist", bookList);
                rd.forward(request, response);


            }

        }
    }
    
}
