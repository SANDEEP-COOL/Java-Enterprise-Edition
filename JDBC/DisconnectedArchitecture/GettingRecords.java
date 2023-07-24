import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;

public class GettingRecords {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            CachedRowSet crs = new CachedRowSetImpl();

            crs.setUrl("jdbc:mysql://localhost:3306/books");

            crs.setUsername("root");

            crs.setPassword("admin");

            crs.setCommand("select bookname from books");

            crs.execute();

            while(crs.next()) {

                System.out.println(crs.getString(1));

            }

            crs.close();

        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }

    }
}
