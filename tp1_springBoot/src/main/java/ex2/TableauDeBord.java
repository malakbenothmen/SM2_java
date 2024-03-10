package ex2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableauDeBord
 */
@WebServlet("/TableauDeBord")
public class TableauDeBord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableauDeBord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] tab= request.getCookies();
		response.getWriter().append("<html>"
				+ "<body>"
				+ "<table>"
				+ "<h1><b>TableauDeBord</b></h1>");
		for(Cookie c: tab)
			{
			if(c.getName().equals("poids") || c.getName().equals("taille") || c.getName().equals("imc") ) 
				{response.getWriter().append("<h4><b>"+ c.getName()+ "</b> : "+c.getValue()+" </h4> " );}
			}
		response.getWriter().append(""
					+ "</table>"
					+ "</body>"
				+ "</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
