package tpn5;

 public class ProprietePrivee extends Proprite{
	
	private int nbPiece ;
	
	ProprietePrivee(){};
	ProprietePrivee(int id,Personne r, String add,double s,int nb)
	{super(id,r,add,s);
	this.nbPiece=nb;}
	int getnbPiece()
	{return this.nbPiece;}

	public String toString()
	{return super.toString()+" nbPiece="+this.nbPiece;}
	
	
	 double calculImpot()
	 {return (50/100)*super.surface+(10/this.nbPiece);}
	 
	 
	}
	


