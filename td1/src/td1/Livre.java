package td1;

public class Livre {
		private String titre, auteur;
		private int nbPages;
		private double prix;
		private boolean prixFixe=false;
		
		Livre()
		{nbPages=0;}

		Livre (String auteur,String titre) 
		{this.auteur =auteur;
		this.titre = titre;}
		
		Livre (String titre,int nb) 
		{this.nbPages=nb;
		this.titre = titre;}
		
		Livre (String titre,String auteur,int nb) 
		{this.auteur =auteur;
		this.titre = titre;
		this.nbPages=nb;}

		Livre (String titre,String auteur,int nb,double prix) 
		{this.auteur =auteur;
		this.titre = titre;
		this.nbPages=nb;
		this.prix=prix;}
	
		
		String getAuteur() 
		{return auteur;}
		
		String getTitre()
		{return titre;}
		
		int getnbPages()
		{return nbPages;}
		
		double getPrix()
		{return prix;}
		
		
		
		void setAuteur(String auteur)
		{this.auteur=auteur;}
		
		void setTitre(String titre)
		{this.titre=titre;}
		

		void setNbPages (int nb)
		{  if (nb>20)
			nbPages = nb;
		else 
			System.out.println("le nombre indiqué est faible");
		}
		
		void setPrix(double prix)
		{ if(!prixFixe)
		{    if (prix>0)
			   {this.prix=prix;
		        prixFixe=true;}
		    else 
		    	System.out.println("le prix doit etre positif");}
		else
			System.out.println("impossible de modifier le prix autre fois !");
		}
		
		
		
		
		
		public String toString()
		{ return ("Livre intitulé "+titre+ " de " +auteur+",contenant "+nbPages+" pages, Prix :"+prix+".");
		}
		public void decrire()
		{ System.out.println(toString());}
		
	    public boolean testPrix() {
	        return prix > 0;
	    }
		
		boolean memeAuteur(Livre l)
		{return (this.auteur==l.auteur);}


}
