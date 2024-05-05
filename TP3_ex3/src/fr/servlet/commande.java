package fr.servlet;

import fr.hotel.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class commande
 */
@WebServlet("/commande")
public class commande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public commande() {
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
		
		int chambre = Integer.parseInt(request.getParameter("chambre"));
		int nombreDeRepas = Integer.parseInt(request.getParameter("nombreDeRepas"));
		String heure = request.getParameter("heure");
		String commentaire = request.getParameter("commentaire");
		
		response.setContentType("text/html");
		
		
		if (( 100 <= chambre ) & ( chambre <= 200 ) & testHeure(heure)) 
		{
			PetitDejeuner commande_petit_dej = new PetitDejeuner(chambre,nombreDeRepas,heure, commentaire);
		
			response.getWriter().append("La commande suivante vient d être créée : <br> \n" );  
			response.getWriter().append(commande_petit_dej.toString()).append("<br> \n");		
			response.getWriter().append("Merci et bonne nuit !  ");
		}
		else
		{
			response.getWriter().append("Cette chambre n'existe pas ou bien l'horaire choisi ne convient pas.").append("<br> \n");					
		}
	}

	private boolean testHeure(String heure)
	{
		int h = Integer.parseInt(heure.split(":")[0]);
		return (6 <= h) & (h <= 10);
	}
	
}


