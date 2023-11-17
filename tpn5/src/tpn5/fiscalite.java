package tpn5;

public class fiscalite {

	public static void main(String[] args) {
		Personne p1=new Personne(001,"malak","ben othmane");
		Personne p2=new Personne(002,"p2","prenom p2");
		Personne p3=new Personne(003,"p3","prenom p3");
		Lotissement l=new Lotissement(10);
		
		Proprite prop1= new ProprietePrivee(1,p1,"Corniche",350,4);
		Villa v1=new Villa(2,p2,"Dar chaabene",400,6,true);
		Appartement  app=new Appartement(3,p2,"Hammamet",1200,8,3);
		ProprieteProfessionnelle pprof1=new ProprieteProfessionnelle(4,p3,"Korba",1000,50,true);
		ProprieteProfessionnelle pprof2=new ProprieteProfessionnelle(5,p1,"Bir Bouragba",2500,400,false);
		
		l.ajouter(prop1);
		l.ajouter(v1);
		l.ajouter(app);
		l.ajouter(pprof1);
		l.ajouter(pprof2);
		
		l.afficheProprietes();
		
	System.out.println(" \n le nombre global des pieces est :"+l.getnbPieces());
	System.out.println("*******la Propriete privee qui paye le moins d'impots*******\n Proprietaire :"+l.moinsImpots()+"\n d'impots :"+l.moinsImpots().calculImpot());
	l.supprimer(app);
	System.out.println("***Apres la supression***");
	l.afficheProprietes();
	
		
	
	Lotissement lt= new LotissementPrivee(10);
	
	System.out.println(lt.ajouter(prop1));
	System.out.println(lt.ajouter(v1));
	System.out.println(lt.ajouter(app));
	System.out.println(lt.ajouter(pprof1));
	System.out.println(lt.ajouter(pprof2));
	
	
	lt.afficheProprietes();
	
   System.out.println(" \n le nombre global des pieces est :"+lt.getnbPieces());
	

	}

}
