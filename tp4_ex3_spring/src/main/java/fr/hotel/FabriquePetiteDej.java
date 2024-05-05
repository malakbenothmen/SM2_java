package fr.hotel;



import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
	public Map<String, String> erreurs = new HashMap<String, String>();
	public boolean succesCreation ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FabriquePetiteDej() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void validationChambre( int chambre ) throws Exception {
    	if (( chambre < 100 ) || ( 200 < chambre ))
    	{
    	throw new Exception( "Le numéro de chambre doit être contenu entre 100 et 200." );
    	}
    	}
    private void validationHeure(String heure) throws Exception {
        if (heure == null || heure.isEmpty()) 
            throw new Exception("L'heure est requise.");
        else {
        	if(heure.compareTo("06:00")<=-1  || heure.compareTo("10:00")>= 1 )
        		throw new Exception("L'heure doit etre entre 06h et 10h ");
    
        }
        }
    public PetitDejeuner construitPetitDejeuner( HttpServletRequest request)
    { 
    int chambre  = 0;
    String heure = null ; 
   
    
    int nbRepas = Integer.parseInt(request.getParameter(CHAMP_NB_REPAS));
    String commentaires = request.getParameter(CHAMP_COMMENTAIRES);
    try {
    	heure = request.getParameter(CHAMP_HEURE);
        validationHeure(heure);}
    catch (Exception e) {
    		erreurs.put(CHAMP_HEURE , e.getMessage());
    		
    }
    try {
    	chambre = Integer.parseInt(request.getParameter(CHAMP_CHAMBRE));
        validationChambre(chambre);}
    catch (Exception e) {
		erreurs.put(CHAMP_CHAMBRE , e.getMessage());

    	}
        succesCreation = erreurs.isEmpty();
        PetitDejeuner ob = new PetitDejeuner( chambre,nbRepas,heure,commentaires);
        return ob;
    }

    

    
    
    
}
