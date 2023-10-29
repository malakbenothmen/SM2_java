package ds2019;

public class test {

	public static void main(String[] args) {
		BoiteCourrier b=new BoiteCourrier(4);
		Courrier l=new Lettre(true,"aabbbcc",350,"A4");
		Courrier c=new Colis(true,"ddeeff",500,1.5);
		Courrier a=new Courrier(false,"abcdef");
		Courrier k=new Courrier(false,"");
		b.ajoutCour(l);
		b.ajoutCour(c);
		b.ajoutCour(a);
		b.ajoutCour(k);
		
		b.afficher();
		System.out.println("le nombre des courries invalide est "+b.courriersInvalides());
		

	}

}
