import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;

public class DeleteRow {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            CachedRowSet crs = new CachedRowSetImpl();
            crs.setUrl("jdbc:mysql://localhost:3306/books");
            crs.setUsername("root");
            crs.setPassword("admin");

            crs.setCommand("select * from books");

            crs.execute();

            while(crs.next()) { 

                System.out.println(crs.getInt(1)+" "+crs.getString(2)+" "+crs.getString(3)+" "+crs.getInt(4)+" "+crs.getDate(5));
                
                // delete from CachedRowSetImpl 
                crs.deleteRow();

                System.out.println("deleted...");

            }

            // apply changes on DB 
            crs.acceptChanges();

        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException c) {
            c.printStackTrace();
        }

    }
}
