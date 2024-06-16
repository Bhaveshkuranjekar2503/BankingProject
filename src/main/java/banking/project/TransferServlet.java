package banking.project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TransferServlet
 */
@WebServlet("/transferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountNo = request.getParameter("ano");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String targetAccountNumber = request.getParameter("tan");
		String amount = request.getParameter("amount");
		PrintWriter out = response.getWriter();
		int i = TransferDAO.transfer(accountNo, uname, password, targetAccountNumber, amount);
		System.out.println("i value"+i);
		if(i>0) {
			out.println("<h1>Money transfered successfully<h1>");
			request.getRequestDispatcher("welcome.jsp").include(request, response);
		}
		else {
			out.println("<h1>Transaction failed<h2>");
			request.getRequestDispatcher("Transfer.jsp").include(request, response);
		}
	}

}
