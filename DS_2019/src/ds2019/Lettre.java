package ds2019;

public class Lettre extends Courrier{

	private int poid;
	private String format;

	
	Lettre(boolean m,String add,int p,String f)
	{super(m,add);
	this.poid=p;
	setFormat(f);};
	
	int getPoid()
	{return this.poid;}
	String getFormat()
	{return this.format;}

	void setPoid(int p)
	{this.poid=p;}
	
	
	
 void setFormat(String f)
 {   if (f.toUpperCase()=="A3" || f.toUpperCase()=="A4")
	    this.format=f.toUpperCase();
 else 
	 System.out.println("format non valide");}
	
	
@Override
void decrire()
{super.decrire();
System.out.println(", Poid:"+this.poid+", Format: "+this.format);}


double affranchir()
{double mont=0;
if(super.estVlide())
{  if(this.format=="A4")
     {mont+=2.50;}
    else
     {mont+=3.50;}
mont+=this.tarif*this.poid+0.5;
if(this.mode)
	mont=mont*2;
}
return mont;};
}


