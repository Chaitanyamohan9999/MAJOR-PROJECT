package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gr11","root","Mysql@123");
		}
		catch(Exception e)
		{
			System.out.println("CryptDB database error:"+e);
		}
		return con;
	}
	
}
