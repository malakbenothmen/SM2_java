package frServlet;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.hotel.*;


/**
 * Servlet implementation class Commande
 */
@WebServlet("/Commande")
public class Commande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Commande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 request.getRequestDispatcher("WEB-INF/formulaire.jsp").forward(request , response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		FabriquePetiteDej fabrique = new FabriquePetiteDej();
		
	
		PetitDejeuner petitDej = fabrique.construitPetitDejeuner(request);
		// Ajout du bean à l'objet request pour Dispatcher vers recapitulatif.jsp
		
		if(fabrique.succesCreation)
			{request.setAttribute("attributPetitDej", petitDej );
			request.getRequestDispatcher("WEB-INF/recapulatif.jsp").forward(request, response);}
		else
			{
			request.setAttribute("erreurs", fabrique.erreurs );
			request.getRequestDispatcher("WEB-INF/formulaire.jsp").forward(request, response);}
			
		
	}

}
