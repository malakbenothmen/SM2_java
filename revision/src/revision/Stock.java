package revision;

public class Stock {
	private OperationStock[] tabOp;
	private int nb;
	
	
	Stock(int cap)
	{
		tabOp=new OperationStock[cap];
		
	}
	
	void ajouterOp(OperationStock op)
	{if (nb<this.tabOp.length)
		{this.tabOp[nb]=op;
		nb++;}
	else
		System.out.println("impossible d'ajouter , tab complet !!");}
	
	void affichOpAchat()
	{for(int i=0;i<nb;i++)
		{if(this.tabOp[i] instanceof Achat)
			System.out.println(this.tabOp[i]);
		}
	}
	
	double meilleurPrixVente(Article a)
	{   double meilleur=0;
		for(int i=0;i<nb;i++)
		{if(this.tabOp[i] instanceof Vente)
			{if(this.tabOp[i].art.equals(a) && ((Vente)tabOp[i]).getPrixVente()>meilleur)
				{meilleur=((Vente)tabOp[i]).getPrixVente();}	
			}
		}
		return meilleur;
		
	}



}
