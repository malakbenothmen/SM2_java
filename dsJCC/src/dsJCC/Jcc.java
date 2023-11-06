package dsJCC;

public class Jcc {
	private Film[] competition;
	private int annee;
	private final int NBMAX=30;
	private int nbF;
	
	Jcc(int n,int ann)
	{if(n<=this.NBMAX && n>0)
	{this.setAnnee(ann);
	competition = new Film[n];
	}
	else
		System.out.println("saisir une taille entre 0 et "+this.NBMAX);
	}
	
	
	
	void setAnnee(int an)
	{if(an>0)
		this.annee=an;}
	
	void ajoutFilm(Film f)
	{if (this.nbF<this.competition.length)
		this.competition[nbF]=f;
	    nbF++;}
	
	void listeFilmJCC()
	{ for(int i=0;i<nbF;i++)
		{System.out.println(this.competition[i]);}
	
	}
	
	float totalVenteBillets()
	{  float tot=0;
		for(int i=0;i<this.nbF;i++)
		{tot+=this.competition[i].totalVenteBillets();}
		
		return tot;
	}
	
	public static void main(String[] args)
	{Jcc j=new Jcc(20,2021);
	Film d=new Documentaire("le dernier refuge","Ousam","Mali",86,"la guerre civile");
	d.setNbplaces(30);
	j.ajoutFilm(d);
	Film f1=new Film ("Insurrection","Jilani Saadi","Tunisie",105);
	f1.setNbplaces(45);
	j.ajoutFilm(f1);
	j.listeFilmJCC();
	System.out.println("\n***** le montant total de ventes est :"+j.totalVenteBillets());}
	
	
	

}
