package banking.project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class CloseServlet
 */
@WebServlet("/close")
public class CloseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CloseServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accountNumber = request.getParameter("ano");
		String uname = request.getParameter("uname");
		String password = request.getParameter("pword");
		 response.setContentType("text/html");
		int i=0;
		PrintWriter out = response.getWriter();
		try {
			 i = CloseDAO.close(accountNumber, uname, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(i>0) {
			out.println("Your account closed successfully");
			out.println("Your account data deteted successfully");
			request.getRequestDispatcher("welcome.jsp").include(request, response);
		}
		else {
			out.println("Sorry !!!!............");
			out.println("you entered invalid details");
			out.println("your account could not be deleted");
			request.getRequestDispatcher("Close.jsp").include(request, response);
		}
	}
}
