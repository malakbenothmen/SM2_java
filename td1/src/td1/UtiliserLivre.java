package td1;

public class UtiliserLivre {

	public static void main(String[] args) {
    //exercice 1 
		
	/* Livre l1=new Livre("Nelson","Demain est un autre jour");
     Livre l2=new Livre("Nelson","nature");
     Livre l3=new Livre("leo","bizare");
     System.out.println(l1.memeAuteur(l3));
     System.out.println(l1.memeAuteur(l2));*/
	System.out.println("****\n ");
	//exercice2 
	 Livre[] livres=new Livre[3];
	 livres[0]=new Livre("l'alchimiste","coelho",225);
	 livres[1]=new Livre("le Coran",508);
	 livres[2]=new Livre("JK Rowling","Harry Potter");
	 for(int i=0;i<3;i++)
	 {System.out.println(livres[i]);
	 
	 }
	 System.out.println("\n****\n ");
	 livres[1].setAuteur("Paulo Coelho");
	 livres[2].setNbPages(461);
	 for(int i=0;i<3;i++)
	 {livres[i].decrire();}
	 
	 System.out.println("****\n ");
	 //exercice 3
	 
	 livres[1].setPrix(15.500);
	 livres[2].setPrix(12000);
	 livres[1].decrire();
	 livres[2].decrire();
	 livres[1].setPrix(17.700);
	 
	 
	 
	 
	 
	 
	
	
	}

}
