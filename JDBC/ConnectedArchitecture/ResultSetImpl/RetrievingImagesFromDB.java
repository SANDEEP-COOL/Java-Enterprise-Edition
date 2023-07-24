import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.io.FileOutputStream;

public class RetrievingImagesFromDB {
    
    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "admin");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select images from books");

            if(rs.next()) {

                // image to Blob Object 
                Blob blobImage = rs.getBlob(1);

                // Blob object to byte array 
                byte[] imageByte = blobImage.getBytes(1, (int)blobImage.length());

                // FileOutputStream 
                FileOutputStream fos = new FileOutputStream("E:\\JavaEnterpriseEdition\\codes\\JDBC\\image.jpg");
                
                // write()
                fos.write(imageByte);

                fos.close();
            }

            rs.close();
            st.close();
            con.close();
        }
        catch(IOException i) {
            i.printStackTrace();
        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }

    }

}