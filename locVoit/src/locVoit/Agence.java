package locVoit;

public class Agence {
  private Voiture[] tabv;
  private String reference;
  private int taille;
  private int nb ;
  
  Agence(int taille)
  {this.taille=taille;
  this.tabv=new Voiture[taille];
		  }



void selectionne(Critere c)
{for(int i=0;i<nb;i++)
	{if (c.correspond(tabv[i]))
			{System.out.println(this.tabv[i].toString());}
}
}
void ajout(Voiture v) throws AjoutInterditException
{ if (nb<this.taille)
	{if(2016 - v.anneP<=5)
		{tabv[nb]=v;
		nb++;
		}
	else
		 throw new AjoutInterditException("interdit d'ajouter un voiture depasse 5ans") ;
	     }
else
{System.out.println("le Tableau de voiture est complet");}


}

}
