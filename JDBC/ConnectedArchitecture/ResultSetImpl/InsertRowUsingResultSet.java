import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertRowUsingResultSet {
    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from books");

            Scanner sc = new Scanner(System.in);
            for(int i = 0 ; i < 2 ; i++) {

                // pointer will place to a new blank row
                rs.moveToInsertRow();

                System.out.println("enter bookid");
                int id = sc.nextInt();

                System.out.println("enter bookname");
                String name = sc.next();

                System.out.println("enter subject");
                String subject = sc.next();

                System.out.println("enter price");
                int price = sc.nextInt();

                // insert record in new row - using updateXXX()
                rs.updateInt(1, id);
                rs.updateString(2, name);
                rs.updateString(3, subject);
                rs.updateInt(4, price);

                // finally append row - into DB 
                rs.insertRow();

                // move cursor where cursor was before calling moveToInsertRow()
                rs.moveToCurrentRow();

            }

            rs.close();
            st.close();
            con.close();
            sc.close();

        }
        catch(SQLException s){

        }
        catch(ClassNotFoundException c) {

        }
        
    }
}
