package tpn5;

 public class Villa extends ProprietePrivee{
	private boolean avecPiscine;
	
	
	Villa(int id,Personne r, String add,double s,int nb,boolean p)
	{super(id,r,add,s,nb);
	this.avecPiscine=p;}
	
	public String toString()
	{return super.toString()+" avecPiscine ou Non?="+this.avecPiscine;} 
	
	 double calculImpot()
	 {if (this.avecPiscine)
		 return super.calculImpot()+200;
	 else
		 return super.calculImpot();}
	 
	

}
