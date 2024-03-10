package tpExamen;

public class Stock {
    private OperationStock[] tabOp;
    private int nb;
    private int capaciteMax;
    
    public Stock(int cMax) {
        this.tabOp = new OperationStock[cMax];
        this.capaciteMax = cMax;
    }
    
    public void ajouterOp(OperationStock op) {
        if (this.nb < capaciteMax) {
            tabOp[nb] = op;
            nb++;
        } else {
            System.out.println("Le tableau des opérations est plein. Impossible d'ajouter une nouvelle opération.");
        }
    }
    
    public void affichOpAchat() {
        System.out.println("Liste des opérations d'achat :");
        for (int i = 0; i < nb; i++) {
            if (tabOp[i] instanceof Achat) {
                System.out.println(tabOp[i].toString());
            }
        }
    }
    
    double meilleurPrixVente(Article a) {
            double meilleur =-1;
            for (int i = 0; i < nb; i++) {
                if (tabOp[i] instanceof Vente && tabOp[i].art.equals(a)) {
                    Vente vente = (Vente) tabOp[i]; 
                    double prixVente = vente.getPrixVente();
                    if (meilleur== -1 || prixVente > meilleur) {
                        meilleur= prixVente;
                    }
                }
                }
            return meilleur;
    
              }
}
