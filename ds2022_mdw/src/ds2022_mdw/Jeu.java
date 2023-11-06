package ds2022_mdw;

public class Jeu {
	private carte[] tabCartes;
	private int nb;
	
	Jeu(int taille)
	{  if(taille>0 && taille<=10)
		{this.tabCartes=new carte[taille];
	    System.out.println("on change de main");}
	else
		System.out.println("entrer une taille entre 0 et 10 svp!!");
	    return;}
	
	 void ajouter(carte c) 
	 {if(nb<tabCartes.length)
		 {this.tabCartes[nb]=c;
		 if (this.tabCartes[nb] instanceof terrain)
			 System.out.println("Un nouveau "+this.tabCartes[nb].getClass().getSimpleName());
		 else 
		 {if (this.tabCartes[nb] instanceof creature)
			 System.out.println("Une nouvelle  "+this.tabCartes[nb].getClass().getSimpleName());
		 else
			 {if(this.tabCartes[nb] instanceof sortilage)
				 System.out.println("Un "+this.tabCartes[nb].getClass().getSimpleName()+" de plus.");}}
		 
			 nb++;
		
		 }
	 }
	 
	 void afficher()
	 {for(int i=0;i<this.nb;i++)
		 {System.out.println(this.tabCartes[i]);
		 }
	 }
	 
	 
	 void jouer()
	 { int i=0;
		 while(this.tabCartes[i]==null && i<nb)
			 {i++;}
		 
		 if (i<nb)
		 {   System.out.println("je joue une carte ... \n la carte jouée est : ");
			 System.out.println(this.tabCartes[i]);
			 this.tabCartes[i]=null;}
	 }
	 
	 
		 

}



