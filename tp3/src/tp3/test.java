package tp3;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
	 
 
         //on peut remplir le tableau a partir du clavier :
        /*
		  Scanner scanner = new Scanner(System.in);
	   	  System.out.print("le nombre des comptes Veuillez creer : ");
          int NB_Comptes=scanner.nextInt(); 
          compte[] tab_comptes= new compte[NB_Comptes];
          for(int i=0 ; i< NB_Comptes ;i++)
        { String nom= scanner.nextLine();
          String prenom= scanner.nextLine();
          String adresse= scanner.nextLine();
          personne titulaire=new personne(nom,prenom,adresse);
		  compte c=new compte(titulaire);
		  tab_comptes[i]=c;}*/
		
        personne titulaire=new personne("malak","benothmen","qsvbdknlb");
  	    compte c=new compte(titulaire,10000,2000,-1000);
  	  personne pers2=new personne("ali","aliali","assisxqmjv");
        compte c2=new compte(pers2);
        personne pers3=new personne("salma","saloum","scnshvhn");
  	    compte c3=new compte(pers3,1000,700,-400);
  	    personne pers4=new personne("salah","saliha","dvojgpvj");
	    compte c4=new compte(pers4,200,300,-300);
	    compte [] tab_comptes= {c,c2,c3,c4};
		  for(int i=0 ; i< 4 ;i++)
		  {    System.out.println(tab_comptes[i]);
				System.out.println("\n ************************\n");
		  }
		  double max=0;
		  personne pers=titulaire;
		  for(int i=0 ; i< 4 ;i++)
		  {  if (tab_comptes[i].getSold()> max)
		  {max=tab_comptes[i].getSold();
		  pers=tab_comptes[i].getTitulaire();}
		  }
		  c.virement(c2,500);
		  System.out.println("\n malak effectue un virement vers ali \n ");
		  System.out.println(c);
		  System.out.println(c2);
		  System.out.println("\n salma effectue un virement vers salah \n ");
		  compte.virement(c3,c4,200);
		  System.out.println(c3);
		  System.out.println(c4);
		  System.out.println("\n les informations de titulaire du compte avec le solde le plus élevé :"+pers);
		  
		  
		  
		  


	}
   


}
