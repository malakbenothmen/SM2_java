package ex2_tp1;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
public class Annuaire {
	
	Map<String,Fiche> table ;
	
	
	Annuaire()
	{this.table=new HashMap<String,Fiche>();}
	
	void ajoutFiche(String n , String add, int num)
	{Fiche f=new Fiche(n,add,num);
	table.put(n, f);}
	
	
	Fiche chercheFiche(String n)
	{ return this.table.get(n);}
	
	
	void AfficheAnuuaire()
	{for( Fiche f : table.values()) {
		System.out.println(f);
	}}
	
	
	
	public static void main(String[] args) {
		Annuaire a=new Annuaire();
		a.ajoutFiche("2emeFicheA", "add1A", 100);
		a.ajoutFiche("3emeFicheB", "add2B", 101);
		a.ajoutFiche("1ereFicheC", "addC", 102);
		String ch;
		do
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir une commande : \n");
		ch= sc.nextLine();
		if (ch.startsWith("!"))
		{    // Conversion du HashMap en TreeMap pour le tri
	        Map<String,Fiche> tabTri = new TreeMap<>(a.table);
	        for( Fiche f : tabTri.values()) {
	    		System.out.println(f);
	    	}}
		else
		{
			if(ch.startsWith("+"))
			{   String add; int num;
			    System.out.println("Entrer l'addresse de fiche: \n");
			    add= sc.nextLine(); 
			    System.out.println("Entrer le numero de fiche : \n ");
			    num = sc.nextInt();
				a.ajoutFiche(ch.substring(1),add, num);}
		
			else 
			{
				if(ch.startsWith("?"))
				{    
					 if (a.chercheFiche(ch.substring(1))!= null )
					 {
						 Fiche f= a.chercheFiche(ch.substring(1));
						 System.out.println(f);
					 }
					 else 
						 System.out.println(" Nom de Ficher doesn't exist , Veullez entrer un nom Correct !");
						 
				}

			}
		
		
		}
		
		
		
		} while (!(ch.equals(".")  || ch.equals("bye")));
		
		
		
	}
	//- B - Autre methode : pour que les Fichier soient triée , on peut remplacer l'ulisation de HashSet par  TreeMap 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
