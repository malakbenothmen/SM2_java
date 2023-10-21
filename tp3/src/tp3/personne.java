package tp3;

public class personne {
	private String nom;
	private String prenom ;
	private String add;
	
	personne(String nom,String prenom,String add)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.add=add;
	}
	
	String getnom()
	{
		return (nom);
	}
	
	String getprenom()
	{
		return (prenom);
	}
	
	void setnom(String nom)
	{ this.nom=nom;}
	
	void setprenom(String prenom)
	{ this.nom=prenom;}
	
public String toString()
{
	return "\n Nom: "+nom+"\n prenom: "+prenom+"\n adresse: "+add;
}
	
}
