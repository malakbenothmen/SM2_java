package TD4;

public class magazine extends Livre{
	private String moisparu;
    
	magazine()
	{}
	magazine(String title,String d,int id,int nb,String m)
	{super(title,d,id,nb);
	this.moisparu=m;}
	
	
	
	
	@Override
	public String toString()
	{return super.toString()+", le mois de parution: "+this.moisparu;
	
	}
	
	
	double calculePrix(int bonus)
	{return (0.35*this.nbPage)*(1+this.TVA)+bonus;
	}
	
	
}
