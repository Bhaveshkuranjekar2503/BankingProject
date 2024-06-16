package banking.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

	public static int register(UserBean ub) throws SQLException {
		int k=0;
		Connection con = jdbcConClass.getCon();
	
		String query="insert into bank values(?,?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1,ub.getUname());
		pstmt.setString(2,ub.getPassword());
		pstmt.setDouble(3,ub.getAmount());
		pstmt.setString(4,ub.getAddress());
		pstmt.setLong(5,ub.getPhone());
		pstmt.setString(6,ub.getAccountNumber());
		k = pstmt.executeUpdate();
		return k;
		
	}
}
