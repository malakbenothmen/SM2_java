package tp2;

public class test {
	
	public static void main(String[] args)
	{
		point A= new point();
		A.afficher();
		A.deplacer(1,-2);
		System.out.println("le point apres le deplacement");
		A.afficher();
		System.out.println("le pont a l'origine");
		A.reset();
		A.afficher();
		point P1 = new point();
		point P2 = new point('A',3,5);
		point P3 = new point(P1);
		P1.afficher();
		P2.afficher();
		P3.afficher();
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);
		System.out.println(P1==P2);
		System.out.println(P1==P3);
		System.out.println(P1.coïncide_V1(P3));
		System.out.println(point.coincide_V2(P1,P3));
		System.out.println("\n**********************ex2**************\n");
		
		Cercle c1= new Cercle(P1,10);
		Cercle c2= new Cercle(P2,12.5);
		c1.afficher();
		c2.afficher();
		c1.deplacer(2,4);
		System.out.println("****Apres le deplacement****");
		c1.afficher();
		
		System.out.println(c1==c2);
		System.out.println(Cercle.coincide(c1,c2)); 
		Cercle c3=new Cercle(P2,12.5);
		System.out.println(Cercle.coincide(c2,c3));
		System.out.println(Cercle.coincide(c1,c3));
	}
}
