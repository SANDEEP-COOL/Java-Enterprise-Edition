import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.IOException;

public class InsertingImagesUsingResultSet {
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement();
            PreparedStatement ps = con.prepareStatement("update books set images = ? where bookid = ?");
            ResultSet rs = st.executeQuery("select bookid from books");

            while(rs.next()) {

                int id = rs.getInt(1);

                // image as File object 
                File image = new File("65.png");

                // FileInputStream using FileObject 
                FileInputStream imageStream = new FileInputStream(image);

                // length 
                int length = (int)image.length();

                // setBinaryStream
                ps.setBinaryStream(1, imageStream, length);
                ps.setInt(2, id);

                ps.executeUpdate();

            }
        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
        catch(FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
        // catch(IOException i) {
        //     i.printStackTrace();
        // }
    }
}
