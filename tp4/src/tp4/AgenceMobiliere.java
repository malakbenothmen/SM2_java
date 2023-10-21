package tp4;

public class AgenceMobiliere {
		
		private final int max;
		private Vehicule[] tab;
		private int nb;
		
		
		AgenceMobiliere(int max)
		{this.max=max;
		tab=new Vehicule[this.max];}
		
		void ajoutVehicule(Vehicule v)
		{if (this.nb<this.max)
			{
			tab[nb]=v;
			nb++;}
		else
			{System.out.println("impossibel d'ajouter , le tableau est completement rempli");
			}
		}
		
		int getNb()
		{return this.nb;}
		
		
		 void selection(int n) 
		 {if (n>=0 || n>nb )
			 {System.out.println("la case est vide");}
		 else
			 {tab[n].decrisvehicule();}
		 }
		 
		 void selection(String mq) 
		 { int j=0;
		   int i;
			 for( i=0;i<nb;i++)
			 { if(tab[i].getMarque()==mq)
			      {tab[i].decrisvehicule();
			       j++;}
			 }
			 if (j==0 ) 
			 {System.out.println("il n'y a pas des voiture ayant cette marque");
			 }
	     }
		     
		 
		 void selection(Double px) 
		 {int cpt=0;
		 for(int i=0;i< nb;i++)
		 { if(tab[i].getprix() <=px)
		      tab[i].decrisvehicule();
		      cpt++;}
		 if (cpt==0)
		 {System.out.println("il n'y aa pas des vehicule dans cette marge de prix ");}
		 }
		 
		 void rechercheAnncient()
		 {	int an=tab[0].getAnnee();
			int j=0;
			for(int i=0;i<3;i++)
			{if (an>tab[i].getAnnee())
				{an=tab[i].getAnnee();
				 j=i;}}
			System.out.println("\n la voiture la plus ancienne dans le parking est: \n "+tab[j]);	
		}
		 void affiche()
		 {	for(int i=0;i<3;i++)
			{tab[i].decrisvehicule();
			System.out.println("\n ******");}
		 }
		
		
		
		
	

}
