package LibraryManagement;

import java.sql.*;

public class ConnectionClass 
{
    Connection con;
    Statement stm;
    
    ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:330/LibraryManagement","root","ankit@123");
            stm=con.createStatement();       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        new ConnectionClass();
    }
}
