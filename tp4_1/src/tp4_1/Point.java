package tp4_1;

public class Point {

		protected char nom;
		protected int abs;
		protected int ord;
		
		 Point(char nom,int abs,int ord) 
		{
			this.nom= nom;
			this.abs= abs;
			this.ord= ord;
		}
		 Point() {
			nom='O';
		}
	     Point(Point p)
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
		 boolean coïncide_V1 (Point p) { 
			return  abs == p.abs && ord == p.ord;
			
		}
		static boolean coincide_V2(Point a,Point b)
		{return a.abs == b.abs && a.ord == b.ord ;}
		
	@Override
	// P1.toString()
	public String toString()
	{ 
		return nom + "("+ abs +"," + ord +")";
	}

}



