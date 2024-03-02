package tp2_sem2;
import java.util.HashSet ;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Patient {
	private String nom ;
	private Set <String > ordonnance ;
	
	public Patient ( String n){
	nom = n ;
	ordonnance = new HashSet <String >();
	}
	/*public Patient (String n , String [] ord)
	{
		this(n);
		for (String o : ord)
		{this.ajoutMedicament(o);}
	}*/
	public String getNom () { return nom ;}


	public boolean ordonnanceVide ()
	{ return this.ordonnance.isEmpty(); }

	public void ajoutMedicament ( String m) {
	   if (!this.contientMedicament(m))
		{this.ordonnance.add(m); }
	   else 
	   {System.out.println("Impossible d'ajouter ce medicament car il est deja existe !");}
	}
	
	public void affiche(){
		System.out.println("Nom Patient : " + this.nom);
		System.out.println("Son Ordonnance : [");
		for(String m : this.ordonnance)
			{System.out.println(m+ ',');}	
	System.out.println("]");
	}

	public boolean contientMedicament (String m) {
	 return this.ordonnance.contains(m);
	}
	
	public Set<String> trieOrdonnace() {
		   Set<String> triOrd = new TreeSet<>(this.ordonnance); 
		   return triOrd;
	}
	
	
}
