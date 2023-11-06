package ds2019;

public class Colis extends Courrier{
	private int poid;
	private double vol;
	
	
	Colis(boolean m,String add,int p,double v)
	{super(m,add);
	this.poid=p;
	this.vol=v;}
	
	
	
@Override
void decrire()
{super.decrire();
System.out.println(",Poid:"+this.poid+", Volume: "+this.vol);}

double affranchir()
{double montant=0;
if(super.estVlide())
	montant=0.25*this.vol+this.poid;
{if(this.mode)
	 montant=montant*2;
}

return montant;}

}
