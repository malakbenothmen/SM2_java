package tp4;

public class test {

	public static void main(String[] args) {
		Vehicule v=new Vehicule("Clio","Classique",2000,20.000);
		Vehicule w=new Vehicule("Mercedes","Fantome",2008,60.000);
		Vehicule x=new Vehicule("KIA","Picanto",2012,35.000);
		AgenceMobiliere Voitures=new AgenceMobiliere(10);
		
		Voitures.ajoutVehicule(v);
		Voitures.ajoutVehicule(w);
		Voitures.ajoutVehicule(x);
		
		
		Voitures.affiche();
		System.out.println("\n ---les voitures ayant la marque Marcedes");
		Voitures.selection("Mercedes");
		System.out.println("\n ---les voitures ayant la marque BM");
		Voitures.selection("BM");
		
		System.out.println("\n ---les voitures ayant un prix inferieur a 40.000");
		Voitures.selection(40.000);
		

		Voitures.rechercheAnncient();	
		

	}
}


