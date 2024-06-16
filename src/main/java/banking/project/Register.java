package banking.project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Random;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		UserBean ub=new UserBean();
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		String amount = request.getParameter("Amount");
		double amount1 = Double.parseDouble(amount);
		String address = request.getParameter("Address");
		String phone=request.getParameter("phone");
		long phone1 = Long.parseLong(phone);
		
		ub.setUname(uname);
		ub.setPassword(password);
		ub.setRePassword(repassword);
		ub.setAmount(amount1);
		ub.setAddress(address);
		ub.setPhone(phone1);
		
		 String accountNumber = generateAccountNumber();
		 ub.setAccountNumber(accountNumber);
		int k = 0;
		try {
			k = RegisterDAO.register(ub);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(k>0) {
			request.setAttribute("accountNumber", accountNumber);
			out.println("Account created successfully");
			request.getRequestDispatcher("AccountCreated.jsp").forward(request, response);
		}
		else {
			out.println("not created");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
	}

	private String generateAccountNumber() {
	    Random random = new Random();
	    return String.format("%06d", random.nextInt(1000000));
	}
}
