import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ScrollableAndUpdatableResultSet{
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "select bookid, bookname, subject, bookprice from books order by bookid";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {

                System.out.println("id : "+rs.getInt(1)+" name : "+rs.getString(2)+" subject : "+rs.getString(3)+" price : "+rs.getInt(4));
                int price = rs.getInt(4);
                double newPrice = price * 1.1;
                rs.updateDouble(4, newPrice);
                rs.updateRow();

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