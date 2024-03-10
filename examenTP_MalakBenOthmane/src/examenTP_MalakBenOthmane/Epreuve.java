package examenTP_MalakBenOthmane;

public class Epreuve {
	private Athlete[] tabAth;
	private int nb;
	private int NbMax ;
	private String denomination ;
	private boolean etat;
	
	
	Epreuve(String denomination, int max)
	{this.NbMax=max;
	this.denomination=denomination;
	this.tabAth=new Athlete[max];}
	
	 String etat()
	{ if (this.etat)
		return "terminée";
	else 
		return "n'a  pas terminée";
	}
	 
	 String listeAthlete()
	 {
		 String ch="";
		 for(int i=0;i<nb;i++)
		 {ch+=this.tabAth[i].getNom()+" ";}
		 
		 return ch;
	 }
	
	public String toString()
	{return "Epreuve de denomination : "+this.denomination+" etat :"+this.etat()+" Liste des Athlete : "+this.listeAthlete();}
	
	void ajoutAthelete(Athlete a)
	{if(nb<this.NbMax)
		{this.tabAth[nb]=a;
		nb++;}
	else
		System.out.println("le nombre maximale d'athlete est atteint");
	}
	
	void terminer()
	{
		this.etat = true;
	}
	
	boolean estTerminee()
	{return this.etat;}
	
	Resultat getRecordOlympique()
	{Resultat res=this.tabAth[0].getResultat();
	for(int i =0;i<nb;i++)
	{
		if (this.tabAth[i].getResultat().compareTo(res)==1)
			res=this.tabAth[i].getResultat();
	}
	
	return res;}
	

	
	Athlete getVinqueur()
	{ Resultat bestRes=this.getRecordOlympique();
	  Athlete a=null;
	for(int i=0;i<nb;i++)
		{if (this.tabAth[i].getResultat().compareTo(bestRes)==0)
		{a=this.tabAth[i];}
			
		}
	return a;
	}
	
	void fixeResultat(int id , Resultat r) throws IllegalStateException 
	{
		if (!this.estTerminee())
		{int i=0;
		while(this.tabAth[i].getId() != id && i< nb)
		{i++;}
		if(i<nb)
			{this.tabAth[i].setResultat(r);}
		}
		else
			throw new IllegalStateException("l'eprouve a été terminé imposible de modifier resultat");
		
		
	}
	
	Resultat getResultat(int id)
	{		
			int i=0;
			while(this.tabAth[i].getId() != id && i< nb)
			{i++;}
			if(i<nb)
				return this.tabAth[i].getResultat();
			else 
				return null;				
	}
			
		
	

	

}
