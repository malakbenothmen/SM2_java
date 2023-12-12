package tpExamen;

public class Vente extends OperationStock{

    private double prixVente;
    private int qteVendu;
    
    
    public Vente(Article art, double pv, int qtev) throws QteArticleException {
    	
        super(art);
        this.prixVente = pv;
        this.qteVendu = qtev;
        mouvementerStock(art, qtev);
        
    }
    public double getPrixVente() {
        return prixVente;
    }
    
    public String toString() {
    	return super.toString()+", prixVente=" + this.prixVente +", qteVendu=" + this.qteVendu;

    }
   
    public boolean estMouvementabe() {
  
        return super.art.getQteStock() >= this.qteVendu;
    }  
    
    public void mouvementerStock(Article a, int qte) throws QteArticleException {
        if (estMouvementabe()) {
              a.setQteStock(a.getQteStock() - qte);
        } else {  
            throw new QteArticleException(2);
        }
    }
    
}
