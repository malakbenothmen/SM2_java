package examenTP_MalakBenOthmane;

public class testEpreuve {

	public static void main(String[] args) {
		Epreuve e=new Epreuve("100m haies feminin",10);
		Athlete a1=new Athlete(1,"ath 1");
		Athlete a2=new Athlete(2,"ath 2");
		Athlete a3=new Athlete(3,"ath 3");
		Resultat r1=new ResultatDistance(90);
		Resultat r2 = new ResultatDistance(100);
		Resultat r3=new ResultatDistance(120);
		e.ajoutAthelete(a1);
		e.ajoutAthelete(a2);
		e.ajoutAthelete(a3);
		
		try {
		e.fixeResultat(1, r1);}
		catch(IllegalStateException e1){
			System.out.println(e1.getMessage());	
		}
		catch(IllegalArgumentException e2)
		{System.out.println(e2.getMessage());	}
		
		
		try {
		e.fixeResultat(2, r2);}
		catch(IllegalStateException e1){
			System.out.println(e1.getMessage());	
		}
		catch(IllegalArgumentException e2)
		{System.out.println(e2.getMessage());	}
		
		
		try {
		e.fixeResultat(3,r3);}
		catch(IllegalStateException e1){
			System.out.println(e1.getMessage());	}
		catch(IllegalArgumentException e2)
			{System.out.println(e2.getMessage());	}
		
		e.terminer();
		
		System.out.println("Contenu de "+ e.toString());
		System.out.println("le Vainqueur :"+e.getVinqueur());
		System.out.println("le meilleur resultat realisé  :"+e.getRecordOlympique());
		
		
		
	}

	}


