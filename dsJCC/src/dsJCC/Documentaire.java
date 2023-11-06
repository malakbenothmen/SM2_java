package dsJCC;

public class Documentaire extends Film {
	private String sujet;
	private final float tarif=2.0f;
	
	
	Documentaire(String title,String r,String pays,int d,String suj)
	{super(title,r,pays,d);
	this.sujet=suj;}
	
	public String toString()
	{return super.toString()+" le sujet : "+this.sujet;}
	
	float totalVenteBillets ()
	{return this.nbplaces*this.tarif;}
	
	
	
	

}
