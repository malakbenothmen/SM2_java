package locVoit;

public class Voiture {
	String marque ;
	String modele ;
	int anneP;
	double prix;
	
	public Voiture(String m,String mo , int a, double p)
	{ this.marque=m;
	this.modele=mo;
	this.anneP=a;
	this.prix=p;
	}
	
	
	
	public String getMarque(){ return marque ;}
	public String getModele() { return modele;}
	public int getAnne() { return anneP;}
	public double getPrix() { return prix;}
	public String toString(){
	{ return this.getClass().getSimpleName()+": Marque="+this.marque+", Modele ="+this.modele+", Annee de production="+this.anneP+", Prix="+this.prix;}
	
	
	
	
	


}
}
