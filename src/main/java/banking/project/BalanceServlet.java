package banking.project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BalanceServlet
 */
@WebServlet("/Balance")
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BalanceServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountNumber = request.getParameter("accountNumber");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		UserBean ub=null;
		try {
			 ub = BalanceDAO.checkBalance(accountNumber,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(ub==null) {
			out.println("Please check your username and password");
			request.getRequestDispatcher("Balance.jsp").include(request, response);
		}
		else {
			out.println("Welcome "+uname);
			request.setAttribute("ub", ub);
			request.getRequestDispatcher("View.jsp").include(request, response);
			
		}
	}
}
