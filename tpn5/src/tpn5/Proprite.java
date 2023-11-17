package tpn5;

abstract public class Proprite {
	
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface;
	Proprite()
	{}

	Proprite(int id,Personne r, String add,double s)
	{this.id=id;
	this.responsable=r;
	this.adresse=add;
	this.surface=s;
	}
	
	public boolean equals(Proprite p)
	{return p.id==this.id; }
    public String toString()
	{return "Id="+this.id+" Responsable="+this.responsable+" Adresse="+this.adresse+" Surface="+this.surface+" m"+ " Impot="+this.calculImpot();}
    
    
    abstract double calculImpot();
    
}
