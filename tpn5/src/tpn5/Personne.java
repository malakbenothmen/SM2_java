package tpn5;

public class Personne {
	private int cin;
	private String nom;
	private String prenom;
	
	
	
	Personne(int c,String nom,String p)
	{this.cin=c;
	this.nom=nom;
	this.prenom=p;
	}
	
	int getCin()
	{return this.cin;}
	String getNom()
	{return this.nom;}
	String getPrenom()
	{return this.prenom;}
	
	
	void setCin(int c)
	{this.cin=c;}
	void setNom(String n)
	{this.nom=n;}
	
	void setPrenom(String p)
	{this.prenom=p;}
	
	
	public String toString()
	{return "cin="+this.cin+" Nom="+this.nom+" Prenom="+this.prenom;}
	
	
	
	
	

	
}
