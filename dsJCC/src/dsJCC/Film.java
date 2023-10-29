package dsJCC;
import java.util.Scanner;

public class Film {
	
	String title;
	String realisateur;
	String pays;
	int duree;
	int nbplaces;
	
	
	int getNbplaces()
	{return this.nbplaces;}
	
	
	void setNbplaces(int nb)
	{if(nb>=0)
		this.nbplaces=nb;}
	
	public String toString()
	{return this.title+" "+this.realisateur+" ("+this.pays+") -"+this.duree+"min";}
	
	Film(String title,String pays,int d)
	{
	this.nbplaces++;
	this.pays=pays;
	this.title=title;
	this.duree=d;}
	
	 float totalVenteBillets ()
	 {double mont=0; 
	do{
	Scanner scanner=new Scanner(System.in);
	 int nb= scanner.nextInt();}
	while (nb<=this.nbplaces && nb>=0);
	mont=nb*2+(this.nbplaces+nb)*3;
	
	 }
	
	
	
	
	 
	 }
	
	
	
	
	
	
	

}
