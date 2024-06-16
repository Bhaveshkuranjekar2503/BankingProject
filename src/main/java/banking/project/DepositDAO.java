package banking.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepositDAO {

	public static int  deposit(String accountNumber, String password, String amount0, String uName) throws SQLException{
		Connection con = jdbcConClass.getCon();
		
		double amount1 = Double.parseDouble(amount0);
		
		String query="update bank set amount=amount+? where ACCOUNTNUMBER=? and PASSWORD=? and UNAME=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setDouble(1, amount1);
		pstmt.setString(2, accountNumber);
		pstmt.setString(3,password );
		pstmt.setString(4, uName);
		
		int i = pstmt.executeUpdate();
		return i;
	}
}
