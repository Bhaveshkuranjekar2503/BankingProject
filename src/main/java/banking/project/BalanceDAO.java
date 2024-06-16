package banking.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BalanceDAO {
	
	public static UserBean checkBalance(String accountNumber,String password) throws Exception {
		Connection con = jdbcConClass.getCon();
		UserBean ub=null;
		String query="select * from bank where accountNumber=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1,accountNumber);
		pstmt.setString(2,password);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()){
			ub=new UserBean();
			ub.setUname(rs.getString("uname"));
			ub.setAddress(rs.getString("address"));
			ub.setAmount(rs.getDouble("amount"));
			ub.setAccountNumber(rs.getString("accountNumber"));
			ub.setPhone(rs.getLong("phone"));
		}
		return ub;
	}
}

	
	
	
	
	
	
	
	
	
	
	


