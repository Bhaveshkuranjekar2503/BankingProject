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
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountNumber = request.getParameter("ano");
		String uName = request.getParameter("uname");
		String password = request.getParameter("password");
		String amount = request.getParameter("amount");
		
		int i=0;
		PrintWriter out = response.getWriter();
		try {
			 i = DepositDAO.deposit(accountNumber, password, amount, uName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(i>0) {
			out.println("<!DOCTYPE html>"
				    + "<html lang='en'>"
				    + "<head>"
				    + "<meta charset='UTF-8'>"
				    + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
				    + "<title>Balance Update</title>"
				    + "<style>"
				    + "body {"
				    + "  font-family: Arial, sans-serif;"
				    + "  background-color: #000;"  // Black background
				    + "  color: #fff;"  // White text
				    + "  display: flex;"
				    + "  justify-content: center;"
				    + "  align-items: center;"
				    + "  height: 100vh;"
				    + "  margin: 0;"
				    + "}"
				    + "div.container {"
				    + "  background-color: #333;"  // Darker background for the container
				    + "  padding: 20px;"
				    + "  box-shadow: 0 4px 8px rgba(255,255,255,0.1);"  // Lighter shadow
				    + "  border-radius: 8px;"
				    + "  text-align: center;"
				    + "}"
				    + "h1 {"
				    + "  color: #fff;"  // White text for heading
				    + "}"
				    + "a {"
				    + "  display: inline-block;"
				    + "  margin-top: 20px;"
				    + "  padding: 10px 15px;"
				    + "  background-color: #007bff;"  // Blue button
				    + "  color: #fff;"  // White text for the button
				    + "  text-decoration: none;"
				    + "  border-radius: 4px;"
				    + "}"
				    + "a:hover {"
				    + "  background-color: #0056b3;"  // Darker blue on hover
				    + "}"
				    + "</style>"
				    + "</head>"
				    + "<body>"
				    + "<div class='container'>"
				    + "<h1>Your balance has increased</h1>"
				    + "<a href='welcome.jsp'>Go to Welcome page</a>"
				    + "</div>"
				    + "</body>"
				    + "</html>");

		}
		
		else {
			out.println("<!DOCTYPE html>"
				    + "<html lang='en'>"
				    + "<head>"
				    + "<meta charset='UTF-8'>"
				    + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
				    + "<title>Balance Update</title>"
				    + "<style>"
				    + "body {"
				    + "  font-family: Arial, sans-serif;"
				    + "  background-color: #000;"  // Black background
				    + "  color: #fff;"  // White text
				    + "  display: flex;"
				    + "  justify-content: center;"
				    + "  align-items: center;"
				    + "  height: 100vh;"
				    + "  margin: 0;"
				    + "}"
				    + "div.container {"
				    + "  background-color: #333;"  // Darker background for the container
				    + "  padding: 20px;"
				    + "  box-shadow: 0 4px 8px rgba(255,255,255,0.1);"  // Lighter shadow
				    + "  border-radius: 8px;"
				    + "  text-align: center;"
				    + "}"
				    + "h1 {"
				    + "  color: #fff;"  // White text for heading
				    + "}"
				    + "a {"
				    + "  display: inline-block;"
				    + "  margin-top: 20px;"
				    + "  padding: 10px 15px;"
				    + "  background-color: #007bff;"  // Blue button
				    + "  color: #fff;"  // White text for the button
				    + "  text-decoration: none;"
				    + "  border-radius: 4px;"
				    + "}"
				    + "a:hover {"
				    + "  background-color: #0056b3;"  // Darker blue on hover
				    + "}"
				    + "</style>"
				    + "</head>"
				    + "<body>"
				    + "<div class='container'>"
				    + "<h1>Sorry !!!!....</h1>"
				    + "<h1>Your balance has not increased</h1>"
				    + "<a href='welcome.jsp'>Go to Welcome page</a>"
				    + "</div>"
				    + "</body>"
				    + "</html>");

		}
		
	}

}
