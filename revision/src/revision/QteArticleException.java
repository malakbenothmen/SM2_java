package revision;

public class QteArticleException extends Exception {
	QteArticleException(int nb)
	{super(getRight(nb));}
	
	
	static String getRight(int nb)
	{if (nb==1)
		{return " L’espace de stockage est insuffisant.";}
	else
	   {if (nb==2)
	            {return " la quantité en stock de l’article est insuffisante. !!";}
    	else
	{ return " entrer 1 ou 2";
		
		}
	
	}
	}
}
