import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Transaction {

    public static void main(String[] args) {
        
        Connection  con = null;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement();

            con.setAutoCommit(false);

            // correct query  
            st.executeUpdate("insert into books (bookname, subject, bookprice) values ('learnProgramming1', 'programming1', 2500)");

            // will be cause of exception 
            st.executeUpdate("inserted into books (bookname, subject, bookprice) values ('learnWining1', 'wining1', 1500)");

            // if both are correct
            st.executeBatch();
            
            // if there is no error
            con.setAutoCommit(true);


        }
        catch(SQLException s) {

            s.printStackTrace();
            // if there is any error ,
            // roll back 
            try{

                con.rollback();

            }
            catch(SQLException e) {
                e.printStackTrace();
            }

        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }

    }
}
