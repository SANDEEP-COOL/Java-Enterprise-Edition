import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteRowUsingResultSet {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from books");

            // delete 4th row 
            rs.absolute(3);
            rs.deleteRow();
            System.out.println("4th row deleted!");

            
            // #ERROR 
            // delete 5th row 
            // rs.absolute(4);
            // rs.deleteRow();
            // System.out.println("5th row deleted!");

        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }

    }
}
