package tpn5;

 public class Appartement extends ProprietePrivee {
	
	private int numEtage;
	
	
	Appartement(int id,Personne r, String add,double s,int nb,int num)
	{super(id,r,add,s,nb);
	this.numEtage=num;}
	
	public String toString()
	{return super.toString()+" Numero d'Etage ="+this.numEtage;}

}
