package ds2019;

public class BoiteCourrier {
	
	private Courrier[] tab;
	private int n;
	
	BoiteCourrier(int m)
	{
	this.tab=new Courrier[m];}
	
	void ajoutCour(Courrier c)
	{
	if (n<tab.length)
	this.tab[n]=c;
	this.n++;}
	
	
	
	
	void affranchir()
	{double s=0;
	for(int i=0;i<this.n;i++)
		{s+=tab[i].affranchir();}
	}
	int courriersInvalides()
	{int nb=0;
	for(int i=0;i<this.n;i++)
	{if(! tab[i].estVlide())
		nb++;}
	return nb;
	}
	
	void afficher()
	{
	for(int i=0;i<this.n;i++)
		{tab[i].decrire();
	    if(! tab[i].estVlide())
	    	System.out.println("cette courrier est invalide ");
	System.out.println("**********\n");}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
