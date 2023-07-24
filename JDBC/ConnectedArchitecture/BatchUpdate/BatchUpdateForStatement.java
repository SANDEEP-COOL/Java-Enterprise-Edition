import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class BatchUpdateForStatement {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement();

            // auto-commit false 
            con.setAutoCommit(false);

            // BATCH 
            st.addBatch("insert into books (bookname, subject, bookprice) values ('learnHindi', 'hindi', 2000)");
            st.addBatch("insert into books (bookname, subject, bookprice) values ('learnScience', 'science', 400)");
            st.addBatch("insert into books (bookname, subject, bookprice) values ('learnSpeaking', 'speaking', 600)");
            st.addBatch("update books set date = null");


            // executeBatch 
            st.executeBatch();

            // explicitly commit changes to DB 
            con.commit();

            st.close();
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
