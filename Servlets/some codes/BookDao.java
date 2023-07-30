
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import java.util.ArrayList;


public class BookDao {
    
    private static Connection conn = null;

    static {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");

        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
        catch(SQLException sq) {
            sq.printStackTrace();
        }
        

    }

    public void closeConnection() {

        try{
            conn.close();
        }
        catch(SQLException sq){
            sq.printStackTrace();
        }

    }

    public static List<Book> getAllBooks(String subject){

        List<Book> list = new ArrayList<>();
        try{

            PreparedStatement ps = conn.prepareStatement("select bookid, bookname, bookprice from books where subject = ?");
            ps.setString(1, subject);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
    
                int bookid = rs.getInt(1);
                String bookname = rs.getString(2);
                int price = rs.getInt(3);
                Book b = new Book(bookid, bookname, price);
                list.add(b);
            }

        }
        catch(SQLException sq) {
            sq.printStackTrace();
        }
        
        return list;

    }
    
}
