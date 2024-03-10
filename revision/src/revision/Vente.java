package revision;

 public class Vente extends OperationStock {
	private double prixVente;
	private int qteVendu;
	
	Vente(Article a,double p,int qte) throws QteArticleException
	{super(a);
	this.prixVente=p;
	mouvementerStock(a,qte);}
	
	double getPrixVente() {return this.prixVente;}
	
	public String toString()
	{return super.toString()+" prixVente"+this.prixVente+" Qantité vendu="+this.qteVendu;}
	
	public boolean estMouvementabe()
	{return this.art.getQteStock()>=this.qteVendu;}
	
	public void mouvementerStock (Article a, int qte) throws
	QteArticleException
	{if(estMouvementabe())
		{this.qteVendu=qte;
		this.art.setQteStock(this.art.getQteStock()-qte);
		}
	else
		throw new QteArticleException(2);
	}
	
	
	
	
	
	

}
