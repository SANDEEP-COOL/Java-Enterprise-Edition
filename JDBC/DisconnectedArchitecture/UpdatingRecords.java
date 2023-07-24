import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;


public class UpdatingRecords {
    public static void main(String[] args) {
        

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            CachedRowSet crs = new CachedRowSetImpl();

            crs.setUrl("jdbc:mysql://localhost:3306/books");

            crs.setUsername("root");

            crs.setPassword("admin");

            crs.setCommand("select bookprice from books");

            crs.execute();

            while(crs.next()) {

                crs.updateInt(1, 15000);
                crs.updateRow();

            }

            // again open connection 
            crs.acceptChanges();

            System.out.println("executed...");

        }
        catch(SQLException s) {

        }
        catch(ClassNotFoundException cnf) {

        }

    }
}
