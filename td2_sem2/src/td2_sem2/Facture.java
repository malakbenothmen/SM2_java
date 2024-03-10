package td2_sem2;

import java.util.ArrayList;

public class Facture {
	
		private ArrayList<LigneFacture> lignes ;
		private Stock stock;
		public Facture(Stock stock) {
		this.stock = stock;

		lignes=new ArrayList<LigneFacture>() ;
		}
		public Boolean addLigne(int qt, String a)
		{
			if(!stock.verifArticle(a))
				return false;
			int Q = stock.getQt(a);
			if(Q<=0 || Q < qt)
			{ System.out.println("impossible d'ajouter l'article "+ a+" il faut que la quantité souhaité doit etre inferieur de qteStock !" );
				return false;}
			int id = lignes.size()+1;
			LigneFacture f= new LigneFacture (id ,qt , stock.getArticle(a));
			lignes.add(f);
			stock.changeQt(a, -qt);
			System.out.println("addition de "+ a + " a été effectuée avec succée !" );
			
			return true; }
		
		
		public boolean removeLigne (int id)
		{ int size = lignes.size();
		if(id>size && id<1)
		return false;
		else
		{
		LigneFacture l =lignes.get(id-1);
		int qt = l.getQt();
		stock.changeQt(l.getArticle().getNom(), qt);
		lignes.remove(id -1);
		for(int i =id-1; i<size-1; i++)
		lignes.get(i).setId(i+1);

		return true;

		}

		}
		
		public double getMontantTotal() {
		double mtot = 0;
		for(LigneFacture l: lignes)
		{mtot+= l.getMontantTotal();}
		return mtot;
		}
		
		public void afficheFacture()
		{
			for(LigneFacture l: lignes)
			{System.out.println(l);}
		
			
			
		}

		

}
