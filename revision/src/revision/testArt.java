package revision;

public class testArt {
	public static void main(String[] args) {
	
		Article ar1= new Article(1, "TV", 30,20);
		Article ar2= new Article(2, "LaveVaisselle", 5, 20);
		
		Stock s=new Stock(10);
		 try
		{OperationStock op1= new Achat(ar1,700,20);
		 s.ajouterOp(op1);}
		 catch (QteArticleException e)
		 {System.out.println(e.getMessage());}
		 
		 
		 try
		{OperationStock op2= new Achat(ar2,1600,15);
		 s.ajouterOp(op2);}
		 catch (QteArticleException e)
		 {System.out.println(e.getMessage());}
		 
		 try
		{OperationStock op3= new Vente(ar1,800,20);
		 s.ajouterOp(op3);}
		 catch (QteArticleException e)
		 {System.out.println(e.getMessage());}
		 
		 try
		{OperationStock op4= new Vente(ar2,1800,10);
		 s.ajouterOp(op4);}
		 catch (QteArticleException e)
		 {System.out.println(e.getMessage());
		 }
		 
		 try
		{OperationStock op5= new Vente(ar2,1900,5);
		 s.ajouterOp(op5);}
		 catch (QteArticleException e)
		 {System.out.println(e.getMessage());
		 }
		
		 s.affichOpAchat();
		 double m=s.meilleurPrixVente(ar2);
		 System.out.println(m);
		 
		
		
		
	}

}
