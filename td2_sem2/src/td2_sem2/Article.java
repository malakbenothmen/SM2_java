package td2_sem2;

public class Article {
	private String nom ;
	private double pu ;
	
	Article(String n , double p )
	{
		this.nom = n ;
		this.pu = p ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPu() {
		return pu;
	}

	public void setPu(double pu) {
		this.pu = pu;
	}

	@Override
	public String toString() {
		return "Article [nom=" + nom + ", pu=" + pu + "]";
	}
	
	
}
