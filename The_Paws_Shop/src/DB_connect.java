
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DB_connect {
   
    public static Connection connect(){
        
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/thepawsshop", "root", ""); 
          
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(  e);
        }
        
        return conn;
    }
}