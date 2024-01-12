import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.sql.PreparedStatement;

public class InsertingDateUsingResultSet {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books" , "root", "admin");

            Statement st = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

            PreparedStatement ps = conn.prepareStatement("update books set date = ? where bookid = ?");

            ResultSet rs = st.executeQuery("select bookid , date from books");

            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");

            Scanner sc = new Scanner(System.in);

            while(rs.next()) {

                int id = rs.getInt(1);

                System.out.println("enter date in dd-MM-yyyy format");
                String date = sc.next();

                

                // getting java.util.Date from string date
                java.util.Date utilDate = inputFormat.parse(date);

                // utilDate to milisecond
                long ms = utilDate.getTime();

                // ms to java.sql.Date
                java.sql.Date sqlDate = new java.sql.Date(ms);

                ps.setDate(1, sqlDate);
                ps.setInt(2, id);

                ps.executeUpdate();

            }

        }
        catch(SQLException s) {
            s.printStackTrace();
        }
        catch(ParseException p) {
            System.out.println("Please input date in given format");
        }
        catch(ClassNotFoundException c) {
            c.printStackTrace();
        }

    }
}
