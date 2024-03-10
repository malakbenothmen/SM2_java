package revision;

 public class Achat extends OperationStock {
	
	private double prixAchat;
	private int QtiteAchete;
	
	Achat(Article A, double p,int q) throws QteArticleException
	{super(A);
	this.prixAchat=p;
	mouvementerStock(A,q);}
	
	public String toString()
	{return super.toString()+" prixAchat="+this.prixAchat+ " la QTe d'Achat"+this.QtiteAchete;}
	
	public boolean estMouvementabe()
	{  return ((this.QtiteAchete+this.art.getQteStock())<this.art.getStockMax());}
	
	public void mouvementerStock (Article a, int qte) throws
	QteArticleException
	{if (estMouvementabe())
		{this.QtiteAchete=qte;
		this.art.setQteStock(qte);
		}
	else
		throw new QteArticleException(1);
		
	}
	
	
	

}
