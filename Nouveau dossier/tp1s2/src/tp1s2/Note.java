package tp1s2;

public class Note implements  Comparable<Note>, Statisticable{
	String intitule;
	float note ;
	
	
	Note(String l,float n)
	{
		this.intitule=l;
		this.note=n;
	}
	
	public  float getValue()
	{return this.note;}
	
	public int compareTo(Note n)
	{
		if (this.note==n.note)
		return 0;
	else 
	{
		if (this.note>n.note)
		{return 1;}
		else 
		{
			return -1;
		}
	}
	}
}
