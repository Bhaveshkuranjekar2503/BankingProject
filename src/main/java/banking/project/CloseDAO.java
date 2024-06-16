package banking.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CloseDAO {

	public static int close(String accountNumber, String uname, String password) throws SQLException {
		int t = 0;
		Connection con = jdbcConClass.getCon();
		String query = "delete from bank where ACCOUNTNUMBER =? and UNAME=? and PASSWORD= ?";
		PreparedStatement pstmt = con.prepareStatement(query);

		pstmt.setString(1, accountNumber);
		pstmt.setString(2, uname);
		pstmt.setString(3, password);

		t = pstmt.executeUpdate();
		return t;

	}
}
