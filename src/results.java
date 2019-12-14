

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class results
 */
@WebServlet("/results")
public class results extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public results() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		    Integer id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			Integer age = Integer.parseInt(request.getParameter("age"));
			String email = request.getParameter("email");
			String sports = request.getParameter("sports");
			String address = request.getParameter("address");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Players_Database","root","balaji");
				Statement stmt = con.createStatement();
				int executeUpdate = stmt.executeUpdate("insert into Players_Details values ("+id+",'"+name+"',"+age+",'"+email+"','"+sports+"','"+address+"')");
				if(executeUpdate > 0 ) {
					System.out.println("Record Updated Successfully");
					HttpSession session = request.getSession();
					session.setAttribute("id", id);
					response.sendRedirect("index.jsp");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
