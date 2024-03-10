package tp1s2;

import java.util.ArrayList;
import java.util.Collections;
public class Etudiant implements Comparable<Etudiant>, Statisticable{
	private int matricule;
	private String nom;
	 ArrayList<Note> LNotes ;
	
	Etudiant(int m,String n)
	{
		this.matricule=m;
		this.nom=n;
		LNotes = new ArrayList<Note>() ;
	}
	
	int getMatricule()
	{return this.matricule;}
	
	String getNom()
	{return this.nom;}
	
	void addNote(String lib,float note)
	{
		Note n = new Note(lib,note);
		LNotes.add(n);	
	}
	
	public float getValue()
	{   float s=0;
		for(Note n: this.LNotes)
		{s+=n.note;
		}
		
		
		return s/(this.LNotes.size());
	}

	
	public int compareTo(Etudiant e)
	{
		if(this.getValue()==e.getValue())
		{return 0;}
		else
		{
			if(this.getValue()>e.getValue())
			{return 1;}
			else
				{return -1;}
		}
	}
	
	public String toString()
	{    return "Matricule: " + this.matricule + ", Nom: " + this.nom + " , Moyenne:" + String.format("%.2f",this.getValue()) ;}
	

	
	
	
	

}
