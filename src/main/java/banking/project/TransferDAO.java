package banking.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Savepoint;

public class TransferDAO {

	public static int transfer(String accountNo,String uname,String password,String targetAccountNumber,String amount) {
		Connection con = jdbcConClass.getCon();
		double amount1 = Double.parseDouble(amount);
		
		try {
		con.setAutoCommit(false);
		Savepoint setSavepoint = con.setSavepoint();
		String query="update bank set amount=amount-? where accountnumber=? and uname=? and password=?";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setDouble(1,amount1);
		pstmt.setString(2,accountNo);
		pstmt.setString(3,uname);
		pstmt.setString(4, password);
		
		int k = pstmt.executeUpdate();
		System.out.println("K value "+k);
		if(k>0)
		{
			String query2="update bank set amount=amount+? where accountnumber=?";
			PreparedStatement pstmt2 = con.prepareStatement(query2);
			pstmt2.setDouble(1,amount1);
			pstmt2.setString(2,targetAccountNumber);
			
			int k1 = pstmt2.executeUpdate();
			System.out.println("k1 value is"+k1);
			if(k1>0) {
				con.commit();
				return 1;
			}
			else {
				con.rollback(setSavepoint);
			}
		}
		else {
			con.rollback(setSavepoint);
		}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return 0;
	}
}
