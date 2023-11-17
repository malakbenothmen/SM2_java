package tpn5;

public class ProprieteProfessionnelle extends Proprite{
	
	private int nbEmployes;
	private boolean estEtatique;
	
	ProprieteProfessionnelle(int id,Personne r, String add,double s,int nb,boolean etat)
	{super(id,r,add,s);
	this.estEtatique=etat;
	this.nbEmployes=nb;}
	
	String getEstatique()
	{if (this.estEtatique)
		return "C'est une propriété appartenant a l'Etat";
	else
		return "Propriéte n'appartient pas a l'etat"; }
	
	public String toString()
	{return super.toString()+" nombre d'employee="+this.nbEmployes+" "+this.getEstatique();}
	
	 double calculImpot()
	 {if(this.estEtatique)
		 return 0;
	 else
		 return (100/100)*super.surface+30;}

}
