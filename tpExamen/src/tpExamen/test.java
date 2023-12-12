package tpExamen;

public class test {

	public static void main(String[] args) {
		
        Stock s = new Stock(10);
		
        Article ar1 = new Article(1, "TV", 30, 100);
        Article ar2 = new Article(2, "LaveVaisselle", 5, 20);
		
        try {
            Achat achat1 = new Achat(ar1, 700, 20);
            Achat achat2 = new Achat(ar2, 1600, 15);
            Vente vente1 = new Vente(ar1, 800, 20);
            Vente vente2 = new Vente(ar2, 1800, 10);
            Vente vente3 = new Vente(ar2, 1900, 5);
            s.ajouterOp(achat1);
            s.ajouterOp(achat2);
            s.ajouterOp(vente1);
            s.ajouterOp(vente2);
            s.ajouterOp(vente3);
        } catch (QteArticleException e) {
        	System.out.println("Exception lors de l'opération : " + e.getMessage());
        }
        s.affichOpAchat();
        
        double meilleur = s.meilleurPrixVente(ar2);
        if (meilleur > -1) {
            System.out.println("Le meilleur prix de vente pour l'article ar2 est : " + meilleur);
        } else {
            System.out.println("Aucune vente pour l'article ar2.");
        }
        
    }


	

}
