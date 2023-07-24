import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchUpdateForPreparedStatement {
    
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            String query = "insert into books (bookname, subject, bookprice) values (? , ? , ?)";
            
            PreparedStatement ps = con.prepareStatement(query);

            // set-auto commit false 
            con.setAutoCommit(false);

            // A Query 
            ps.setString(1, "learnSports");
            ps.setString(2, "sports");
            ps.setInt(3, 5000);

            // addBatch 
            ps.addBatch();

            // A Query 
            ps.setString(1, "learnComputer");
            ps.setString(2 , "computer");
            ps.setInt(3 , 2000);

            ps.addBatch();

            // executeBatch 
            ps.executeBatch();

            // explicitly commit changes to DB 
            con.setAutoCommit(true);

            ps.close();
            con.close();

        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }

    }

}
