package tp9_examenTP;

public class Epreuve {
	private Candidat [] t;
	private int CandMax;
	private int nb;
	private boolean  etat;
	private String denomination ;
	

	 Epreuve (String denomination, int max)
	 {
	  this.denomination=denomination;
	  this.CandMax=max;
	  t=new Candidat[max];
	 }
	 
	 String ListCand()
	 {  
		 String ch="";
		 for(int i=0;i<nb;i++)
		     ch+=t[i].getNon()+ "\n";
	     return ch;
	 }
	 
	 public String toString()
	 {return "la denomination :"+this.denomination+" l'etat "+this.etat+" liste des Candidats:"+ this.ListCand();}
	 
	 void ajoutCandidat(Candidat a)
	 {if (nb< this.CandMax)
		 {t[nb]=a;
		 nb++;
		 }
	 else
		 System.out.println("Impossible d'ajouter , nb max est atteint");
		 
	 
	 }
	 
	 void terminer()
	 {this.etat=true;}
	 
	 boolean estTerminee() 
	 {return this.etat;}
	 
	 Resultat getRecord() 
	 {
		Resultat meilleur=t[0].getResultat();
		 for(int i=1;i<nb;i++)
		 { if(t[i].getResultat().compareTo(meilleur)==1)
				 {
			     meilleur= t[i].getResultat();
				 }
		 }
		 return meilleur;
				 
	 }
	 Candidat getVinqueur()
	 {
		 Candidat v=t[0];
		 int i=0;
		 if(this.estTerminee())
		{  while (i < nb && t[i].getResultat()!=this.getRecord())
		    {i++;}
	        if (i<nb)
	           {return t[i];}
	     }
		 
	    return null;
	 
	 }
	 
	 void fixeResultat(int id, Resultat r)
	 {
		int i=0;
		if (!this.estTerminee())
		{
		   while (i<nb && t[i].getId() != id) i++;
		   if (i<nb)
		        {t[i].setResultat(r);}
		   else
		    	System.out.println("il n'existe pas un condidant dont ce Id");
	    }
		else
			throw new IllegalStateException("l'epreuve est terminé");
	 }
	 
	 Resultat getResultat(int id) 
	 {
			int i=0;
			while (i<nb && t[i].getId() != id) i++;
			if (i<nb)
			   {return t[i].getResultat();}
			else 
				return null;
			
	 }
	 
	 

}
