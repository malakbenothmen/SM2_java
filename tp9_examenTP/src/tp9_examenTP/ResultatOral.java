package tp9_examenTP;

public class ResultatOral implements Resultat{

	private char  appreciation; 
	
	
	public char getAppreciation()
	{return this.appreciation;}
	
	public void setAppreciation(char app)
	{if (app=='A' || app=='B' || app=='C')
		this.appreciation=app;}
	
	
	public String toString()
	{return " Appreciation= "+this.appreciation;}
	
	
	public int compareTo(Resultat r)
	{if( r instanceof ResultatOral)
		{if (this.appreciation == ((ResultatOral)r).getAppreciation())
			return 0;
		else 
		{
			if (this.getAppreciation() > ((ResultatOral)r).getAppreciation() )
				return 1;
			
			else
				return -1;
		}
		}
	else 
		throw new IllegalArgumentException();
	}
			

}
