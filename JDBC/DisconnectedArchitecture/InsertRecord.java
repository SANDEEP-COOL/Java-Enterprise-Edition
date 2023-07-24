import java.sql.DriverManager;
import javax.sql.rowset.CachedRowSet;
import java.sql.SQLException;
import com.sun.rowset.CachedRowSetImpl;

public class InsertRecord {
    
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            CachedRowSet crs = new CachedRowSetImpl();

            // setUrl 
            crs.setUrl("jdbc:mysql://localhost/books");

            // setUsername 
            crs.setUsername("root");

            // setPassword 
            crs.setPassword("admin");

            // setCommand 
            crs.setCommand("select bookname, subject, bookprice from books");

            crs.execute();

            // moveToInsertRow 
            crs.moveToInsertRow();

            // value for new row 
            crs.updateString(1, "CachedRowSetImplLearning");
            crs.updateString(2, "cachedRowSetImple");
            crs.updateInt(3, 3000);

            // insert new row in CachedRowSetImpl 
            crs.insertRow();

            crs.moveToCurrentRow();

            // append changes on DB 
            crs.acceptChanges();

            System.out.println("done...");

        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }

    }

}
