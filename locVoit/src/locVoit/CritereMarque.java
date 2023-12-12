package locVoit;

public class CritereMarque implements Critere{
	private String marque;
	CritereMarque(String marq)
	{this.marque=marq;}
	public boolean correspond(Object o)
	{
		if(!(o instanceof Voiture))
			return false;
		else
		{if (((Voiture) o).getMarque().equals(this.marque))
			return true;
		else
			return false;
		}
	}

}
