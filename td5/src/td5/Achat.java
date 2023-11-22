package td5;
import java.util.Scanner;
public class Achat {
    static Article[] supermarche=new Article[4];
    
	public static void main(String[] args) {
		Achat.supermarche[0]=new Vetement(123,"Jupe",39.000f,2,"bleue","S");
		Achat.supermarche[1]=new ProduitElec(145,"TV LED 80CM",1450.000f,0,"TV");
		Achat.supermarche[2]=new Vetement(178,"Pantalon",42.000f,5,"noir","M");
		Achat.supermarche[3]=new ProduitGC(191,"Pates",0.410f,18);
		System.out.println(Achat.supermarche[0].estDispo(0));
		System.out.println(Achat.supermarche[1].estDispo(1));
		System.out.println(Achat.supermarche[2].estDispo(1));
		System.out.println(Achat.supermarche[3].estDispo(3));
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i< Achat.supermarche.length;i++)
		{	float mont=0;
	     	System.out.println("Saisir la Qte Acheté pour "+Achat.supermarche[i].libelle);
		    int nb= sc.nextInt();
		   if(Achat.supermarche[i].estDispo(nb))
		   {     System.out.println("*****Article  Disponible *****");
			     Achat.supermarche[i].decrire();
	         	if (Achat.supermarche[i].appartientPromo())
				  {if (Achat.supermarche[i] instanceof ProduitElec)
				  { System.out.println(" Prix TTC à payer "+((ProduitElec)Achat.supermarche[i]).prixDeVente("21/03/2023")+" DT");
				      mont+=((ProduitElec)Achat.supermarche[i]).prixDeVente("21/03/2023");}
				  else 
				    { System.out.println(" Prix TTC à payer="+((Vetement)Achat.supermarche[i]).prixDeVente("21/03/2023")+" DT");
				      mont+= ((Vetement)Achat.supermarche[i]).prixDeVente("21/03/2023");
				    }
				  mont*=nb;
				  }
	         	mont+=Achat.supermarche[i].calculPrixTTC()*nb;
	         	  
	         	
	    	}
		else
		    {
			System.out.println("*****Cet Article est indisponible pour le moment******");
			Achat.supermarche[i].decrire();
			
			Achat.supermarche[i].approvisionner(nb);
			}
		   System.out.println("le Montant total a payer="+ mont+"DT");
		   System.out.println("**********************");
		}
			
		
		}
		

}


