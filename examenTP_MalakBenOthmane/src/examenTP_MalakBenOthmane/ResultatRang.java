package examenTP_MalakBenOthmane;

 public class ResultatRang implements Resultat{
	private int rang;
	
	ResultatRang(int r)
	{this.rang=r;}
	
	public int compareTo(Resultat r)
	{if( r instanceof ResultatRang )
		{if(this.rang==((ResultatRang)r).rang)
				return 0;
		else 
		{
			if(this.rang>((ResultatRang)r).rang)
				return 1;
			else
				return -1;
		}
		}
		else 
			throw new IllegalArgumentException();
		
}
	public String toString()
	{return this.getClass().getSimpleName()+" Rang :"+this.rang;
	}
	
	public void afficher()
	{System.out.println(this.toString());}
	
	
	

}
