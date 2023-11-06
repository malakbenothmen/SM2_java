package ds_2022;

public class JeuMulti extends Jeu {
	private int NombreJoueur;
	
	
	JeuMulti(String nom, int annee, int ageMin, Editeur edit, int nbjoueur)
	{super(nom,annee,ageMin,edit);
	this.NombreJoueur=nbjoueur;}
	 
	
	int getNbjoueur()
	{return this.NombreJoueur;}
	void setNbjoueur(int nb)
	{this.NombreJoueur=nb;}
	
	
	
	void decrire()
	{
		super.decrire();
		System.out.println(" Nombre des joueur="+this.NombreJoueur);
		
	}

}
