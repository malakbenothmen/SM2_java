package tp3;

public class compte {
	private int Num_compte ;
	private double sold;
	private double montant;
	static int n ;
	personne titulaire ;
	private double decouvertMax ;
	private double debitMax ;
	private boolean estDecouvert;
	

	
	compte(personne p)
	{  n++;
	 this.Num_compte=n;
	this.titulaire=p;
	this.debitMax=1000;
	this.decouvertMax=-800;
	}
	
	compte(personne p,double s,double debit,double decouvert)
	{
		n++;
		 this.Num_compte=n;
	     this.titulaire=p;
		this.sold=s;
		this.debitMax=debit;
		this.decouvertMax=decouvert;
	}
	
	public String toString()
	{ 
		return "COMPTE N°"+Num_compte+"\n---- Tetulaire:-----"+ this.titulaire +"\n-------"+"\n sold :"+ sold +"\n decouvert Max :" +decouvertMax+"\n debit Max: "+debitMax;
	}
	
	double getSold()
	{ return this.sold;}
	
	
	personne getTitulaire()
	{return this.titulaire;}
	
	void setSold(double s)
	{ this.sold+=s;	}
	
	
	
	
	
	void crediter(double m)
	{if(m>=0)
		 this.sold+=m;
	}
	boolean retrait(double m)
	{
		if (m<=this.debitMax)
		{debiter(m);
		estDecouvert=estDecouvert();
		return true;}
		else 
		{ return false;}
	}
	private void debiter(double m)
	{
		if (this.sold-m >=this.decouvertMax)
		{ sold-=m;}
		else
		{ System.out.println("Desolé vous avez atteint la limite ");}
	
	}
	
	void virement(compte c1,double m)
	{   if(this.retrait(m))
		    c1.crediter(m);}
	
	
  static void virement(compte c1,compte c2,double m)

	  { 
		 if (c1.retrait(m))
		     c2.crediter(m);
	  }





boolean estDecouvert()
{
	return (this.sold<0);
}


		
	
	


}
