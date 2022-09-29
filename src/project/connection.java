 
package project;
import java.sql.*;
 
public class connection {
    public static Connection con(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
            return con1;
        }catch(Exception e){
            System.out.println(e);
        return null;
        }
            
    }
    
}
