import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class RetrivingDateUsingResultSet {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select * from books");

            SimpleDateFormat format = new SimpleDateFormat("dd-MMMM-yyyy");


            while(rs.next()){

                // dates 
                System.out.println("id - "+rs.getInt(1)+" , name - "+rs.getString(2)+" , subject - " +rs.getString(3)+" , price - "+rs.getInt(4)+" , date : "+format.format(rs.getDate(5))+"\n");

            }


        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException c) {
            c.printStackTrace();
        }

    }
}
