package td2_sem2;

public class Main {

	public static void main(String[] args) {

		        Stock stock = new Stock();

		        Article art1 = new Article("3art", 2.5);
		        Article art2 = new Article("1art", 1.8);
		        Article art3 = new Article("2art", 3.0);
		        Article art4 = new Article("4art", 4.5);
		        stock.addNouvArticle(art1, 50);
		        stock.addNouvArticle(art2, 30);
		        stock.addNouvArticle(art3, 40);
		        stock.addNouvArticle(art4, 0);
		        System.out.println("*************Stock initial**********");
		        stock.sortStock();
		        System.out.println("***************************Facture***************************");
		        System.out.println("\n        *********L'ajout des Lignes Facture********   \n ");
		        
		        Facture f = new Facture(stock);
		        
		        f.addLigne(10, "3art");
		        f.addLigne(5, "1art");
		        f.addLigne(8, "2art");
		        f.addLigne(8, "4art");
		        System.out.println("\n         **********les Lignes Facture initial************     \n ");
		        f.afficheFacture();
		        

		        System.out.println("\n Montant total de la facture : " + f.getMontantTotal());
		        
		        System.out.println("************************************************************");
		        
		     
		        System.out.println("Modification de qte de l'article '4art' dans le stock :");
		        stock.changeQt("4art", 20);
		        System.out.println("***********Stock********");
		        stock.sortStock();

		        // Suppression d'un article du stock
		        System.out.println("*****Suppression d'un article art 1 du stock *********");
		        stock.removeArticle("1art");
		        stock.sortStock();
		        

		        System.out.println("*****Suppression  article 1art du Facture*********");
		 
		        f.removeLigne(2);
		        System.out.println("\n         **********les Lignes Facture ************     \n ");
		        f.afficheFacture();
		        

		        System.out.println("\n Montant total après suppression : " + f.getMontantTotal());


		    }
		

	}


