import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {
 public static Connection getConnection()
 {
  Connection conn= null;
  try
  {
   Class.forName("com.mysql.jdbc.Driver");
   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/blooddonation","root","");
   
     
  }
  catch (ClassNotFoundException | SQLException ex)
  {
   System.out.println(ex.getMessage());
  }
 
 return conn;
 }
}

