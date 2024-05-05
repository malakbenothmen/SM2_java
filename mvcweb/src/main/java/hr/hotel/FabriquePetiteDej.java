package hr.hotel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FabriquePetiteDej extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHAMP_CHAMBRE = "chambre";
	private static final String CHAMP_HEURE = "heure";
	private static final String CHAMP_NB_REPAS = "nombreDeRepas";
	private static final String CHAMP_COMMENTAIRES = "commentaires";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FabriquePetiteDej() {
        super();
        // TODO Auto-generated constructor stub
    }
    public PetitDejeuner construitPetitDejeuner( HttpServletRequest request)
    {       
    int chambre = Integer.parseInt(request.getParameter(CHAMP_CHAMBRE));
    String heure = request.getParameter(CHAMP_HEURE);
    int nbRepas = Integer.parseInt(request.getParameter(CHAMP_NB_REPAS));
    String commentaires = request.getParameter(CHAMP_COMMENTAIRES);
    PetitDejeuner ob = new PetitDejeuner( chambre,nbRepas,heure,commentaires);
    return ob;
    }


	

}
