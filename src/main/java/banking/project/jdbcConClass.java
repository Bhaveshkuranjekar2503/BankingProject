package banking.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConClass {


	private static Connection con;
	
	static 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sam","bhavesh");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
