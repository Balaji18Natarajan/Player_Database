

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Servlet implementation class Resultsfull
 */
@WebServlet("/Resultsfull")
public class Resultsfull extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resultsfull() {
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
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Players_Database","root","balaji");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Players_Details WHERE ID = "+id+"");
			 
			while (rs.next()) {
	            String name = rs.getString("Name");
	            int id1 = rs.getInt("ID");
	            int age = rs.getInt("Age");
	            String email = rs.getString("Email");
	            String sports = rs.getString("Sports");
	            String address = rs.getString("Address");
	            System.out.println(name + "\t" + id1 +
	                               "\t" + age + "\t" + email +
	                               "\t" + sports + "\t" +address);
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
