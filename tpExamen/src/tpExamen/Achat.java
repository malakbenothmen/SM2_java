package tpExamen;

public class Achat extends OperationStock {

    private double prixAchat;
    private int qteAchete;
    
    public Achat(Article art, double prixAchat, int qteAchete) throws QteArticleException {
        super(art);

        this.prixAchat = prixAchat;
        this.qteAchete = qteAchete;

        mouvementerStock(art, qteAchete);
    }
    
    public String toString() {
    	return super.toString()+", prixAchat=" + prixAchat + ", qteAchete=" + qteAchete ;
    }
    
    @Override
    public boolean estMouvementabe() {
    	 return (super.art.getQteStock() + qteAchete) <= super.art.getStockMax();
    }
    

public void mouvementerStock(Article a, int qte) throws QteArticleException {
   
    if (estMouvementabe()) {
        a.setQteStock(a.getQteStock() + qte);
    } else {
    	throw new QteArticleException(1);
    }
}

    

    
    
    
}
