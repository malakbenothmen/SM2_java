package dsJCC;
import java.util.Scanner;

public class Film {
	
	String title;
	String realisateur;
	String pays;
	int duree;
	int nbplaces;

	Film(String title,String r,String pays,int d)
	{
	this.pays=pays;
	this.title=title;
	this.realisateur=r;
	this.duree=d;}
	
	int getNbplaces()
	{return this.nbplaces;}
	
	
	void setNbplaces(int nb)
	{if(nb>=0)
		this.nbplaces=nb;}
	
	public String toString()
	{return this.title+" de "+this.realisateur+" ("+this.pays+") -"+this.duree+"min.";}
	

	
	 float totalVenteBillets ()
	 {float mont=0; 
	 int nbEtud;
	 Scanner scanner=new Scanner(System.in);
	/*do{
	System.out.println("Saisir le nombre des etudiants:");
	 nbEtud= scanner.nextInt();}
	while (nbEtud>this.nbplaces || nbEtud<0);*/
	 System.out.println("Saisir le nombre des etudiants:");
	 nbEtud= scanner.nextInt();
	 while (nbEtud>this.nbplaces || nbEtud<0)
	 {	 System.out.println("SVP !! Saisir un nombre des etudiants entre 0 et "+this.nbplaces);
	 nbEtud= scanner.nextInt();}
	mont=(nbEtud*2.0f)+((this.nbplaces-nbEtud)*3.0f);
	
	return mont;
	 }
	 }

	
	
