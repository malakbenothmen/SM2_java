package examenTP_MalakBenOthmane;

public class ResultatDistance implements Resultat {
	private double distance ;
	
	ResultatDistance(double dis)
	{this.distance=dis;}
	public int compareTo(Resultat r)
	{if(r instanceof ResultatDistance)
		{if(this.distance==((ResultatDistance)r).distance)
				return 0;
		else 
		{
			if(this.distance>((ResultatDistance)r).distance)
				return 1;
			else
				return -1;
		}
		}
		else 
			throw new IllegalArgumentException();
		
  }
	public String toString()
	{return this.getClass().getSimpleName()+" Distance :"+this.distance;
	}
	
	public void afficher()
	{System.out.println(this.toString());}
	
	
	
}
