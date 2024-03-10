package ex2;

import javax.servlet.http.Cookie;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculDeMonImc
 */
@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculDeMonImc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p =request.getParameter("poids");
		String t = request.getParameter("taille");
		double poids = Double.parseDouble(p);
		double taille = Double.parseDouble(t);
		Imc m = new Imc(poids,taille);
		double res= m.calcul();
		
        Cookie poidsCookie = new Cookie("poids", String.valueOf(poids));
        Cookie tailleCookie = new Cookie("taille", String.valueOf(taille));
        Cookie imcCookie = new Cookie("imc", String.valueOf(res));

        response.addCookie(poidsCookie);
        response.addCookie(tailleCookie);
        response.addCookie(imcCookie);
        
        response.sendRedirect("/tp1_springBoot/TableauDeBord");
		response.getWriter().append("masse corporelle :"+res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
