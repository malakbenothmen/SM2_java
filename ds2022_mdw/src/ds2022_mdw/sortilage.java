package ds2022_mdw;

public class sortilage extends carte{
	private String nom;
	private String explication;
	
	
	sortilage(double cout,String nom,String exp)
	{super(cout);
	this.nom=nom;
	this.explication=exp;
	}
	
	public String toString()
	{return "Un "+this.getClass().getSimpleName()+" "+this.nom;}
	

}
