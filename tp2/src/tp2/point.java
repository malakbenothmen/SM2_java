package tp2;

public class point {
	char nom;
	int abs;
	int ord;
	
	 point(char nom,int abs,int ord) 
	{
		this.nom= nom;
		this.abs= abs;
		this.ord= ord;
	}
	 point() {
		nom='O';
	}
     point(point p)
	{ nom=p.nom;
	  abs=p.abs;
	  ord=p.ord;
	}
	
	
	void afficher()
	{ 
		System.out.println( nom + "("+ abs +"," + ord +")");
	}
	
	void deplacer(int a,int b)
	{
		
		abs+=a;
		ord+=b;
		
	}
	void reset()
	{
		abs=0;
		ord=0;
	}
	 boolean coïncide_V1 (point p) { 
		return  abs == p.abs && ord == p.ord;
		
	}
	static boolean coincide_V2(point a,point b)
	{return a.abs == b.abs && a.ord == b.ord ;}
	
@Override
// P1.toString()
public String toString()
{ 
	return nom + "("+ abs +"," + ord +")";
}
}
