package locVoit;

 public class CriterePrix implements Critere{
	private double prix;
	CriterePrix(double prixFix)
	{this.prix=prixFix;}
	public boolean correspond(Object o)
	{
		if(!(o instanceof Voiture))
			return false;
		else
		{if (((Voiture) o).getPrix()< this.prix)
			return true;
		else
			return false;
		}
	}
	
}
