package banking.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WithdrawDAO {
	
	public static UserBean login(String accountNumber, String password, double amount1, String uName) throws SQLException {
		Connection con = jdbcConClass.getCon();
		UserBean ub=null;
		
		String query = "select amount from bank where accountnumber=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,accountNumber );
		pstmt.setString(2,password);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			ub=new UserBean();
			ub.setAmount(rs.getDouble("amount"));	
			}
		return ub;
		
		
	}
	public static int withdraw(String accountNumber, String password, double amount0, String uName) throws SQLException {
		Connection con = jdbcConClass.getCon();

		

		String query = "update bank set amount=amount-? where ACCOUNTNUMBER=? and PASSWORD=? and UNAME=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setDouble(1, amount0);
		pstmt.setString(2, accountNumber);
		pstmt.setString(3, password);
		pstmt.setString(4, uName);

		int i = pstmt.executeUpdate();
		return i;
	}
}
