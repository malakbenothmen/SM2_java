package tp5;

public class Vendeur extends Salerie {
	private double vente;
	private double pourcentage;
	
	
	Vendeur(int m,String nom,double rec,double v,double pour)
	{super(m,nom,rec);
	this.vente=v;
	this.pourcentage=pour;}
	
	double getVente()
	{return this.vente;}
	double getPourcentage()
	{return this.pourcentage;}
	void setVente(double v)
	{this.vente=v;}
	
	void setPourcentage(double pour)
	{this.pourcentage=pour;}
	
	@Override
	void affiche()
	{super.affiche();
	System.out.println(", Vente= "+this.vente+", Pourcentage= "+this.pourcentage);
	}
	double Salaire()
	{return super.Salaire()+this.vente*this.pourcentage;}
	

}
