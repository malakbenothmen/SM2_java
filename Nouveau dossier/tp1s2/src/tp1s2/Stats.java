package tp1s2;

import java.util.ArrayList;
import java.util.Collections;

public class Stats  {

	static public Note meuilleurNote(Etudiant e)
	{
        Note meilleureNote = Collections.max(e.LNotes); 
        return meilleureNote;

	}
	static public Note moinsNote(Etudiant e)
	{
		return Collections.min(e.LNotes);
	}
	
	
	static public Etudiant meuilleurEtud(ArrayList<Etudiant> tabE)
	{
		return Collections.max(tabE);
	}
	static public Etudiant moinsBonEtud(ArrayList<Etudiant> tabE)
	{
		return Collections.min(tabE);
	}
	static public float MoyGroup(ArrayList<Etudiant> tabE)
	{
		float s=0;
		for(Etudiant e: tabE)
		{s+=e.getValue();}
		return s/tabE.size();
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<Etudiant> l=new ArrayList ();
		Etudiant e1 = new Etudiant(001,"Malak");
		e1.addNote("java",17.5f);
		e1.addNote("uml",15);
		e1.addNote("dev",18);

		
		
		
		
		Etudiant e2=new Etudiant(002,"Salah");
		e2.addNote("java",11.75f);
		e2.addNote("uml",13);
		e2.addNote("dev",18.5f);		
		
		
		
		Etudiant e3=new Etudiant(003,"Intissar");
		e3.addNote("java",20);
		e3.addNote("uml",14);
		e3.addNote("dev",15.5f);		
		
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		for(Etudiant e:l)
		{  System.out.println(" ****************l'etudiant : "+e.getNom()+"************");
		   System.out.println("Sa Moyenne : "+String.format("%.2f",e.getValue()));
		   System.out.println("Meuilleure Note  est : " + String.format("%.2f",Stats.meuilleurNote(e).getValue()));
		   System.out.println("Moins bon  Note  est : "+ String.format("%.2f",Stats.moinsNote(e).getValue()));
		}
		System.out.println("*********************************************************");
		System.out.println("le Meuilleur Etudiant :"+Stats.meuilleurEtud(l).getNom() + ", moyenne : "+ String.format("%.2f",Stats.meuilleurEtud(l).getValue()));
		System.out.println("la moyenne du group :"+Stats.MoyGroup(l));
		System.out.println("le moins bon etudiant :"+Stats.moinsBonEtud(l).getNom()+ " , moyenne :"+ String.format("%.2f",Stats.moinsBonEtud(l).getValue()));
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("\n *****************Liste triée selon la Moyenne :******************");
		for (Etudiant e : l) {
		    System.out.println(e);
		}
		
		Collections.sort(l, Collections.reverseOrder(new CompareMatric()));
		System.out.println("\n **************Liste triée selon Matricule la plus grand :******************");
		for (Etudiant e : l) {
		    System.out.println(e);
		}
		
		Collections.sort(l, new CompareNom());
		System.out.println("\n **************Liste triée selon Nom :******************");
		for (Etudiant e : l) {
		    System.out.println(e);
		}
		

	
}
}
