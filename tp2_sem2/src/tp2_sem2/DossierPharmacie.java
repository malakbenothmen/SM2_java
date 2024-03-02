package tp2_sem2;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;


public class DossierPharmacie {
	
	private String nom ;
	private HashMap <String , Patient > patients ;
	
	public DossierPharmacie ( String n){
	nom =n;
	patients = new HashMap <String , Patient >();
	}

	void nouveauPatient ( String nom , String [] ord )
	{
	String n = nom.toLowerCase();
	if(this.patients.containsKey(n))
		{
			System.out.println("Ce patient est déjà enregistré dans le dossier. Veuillez saisir un nom unique pour ajouter un nouveau patient. !");
		}
	else
		{Patient p = new Patient(n);
		for (String o : ord)
			{p.ajoutMedicament(o);}
		this.patients.put(n, p);
		}
	}
	
	public boolean ajoutMedicament (String nom, String m){
		
		if( this.patients.containsKey(nom.toLowerCase()))
			{Patient p =this.patients.get(nom.toLowerCase());
			if (! p.contientMedicament(m))
			    {p.ajoutMedicament(m);
			    return true;}
			else 
				return false ;}
		else
			return false ;
		}
	
	
	public void affichePatient (String nom){
		if(this.patients.containsKey(nom.toLowerCase()))
		{Patient p =this.patients.get(nom.toLowerCase());
		p.affiche();}
		else
		{
			System.out.println("Patient n'existe pas");
		}
		
	}
	
	public void affiche (){
		System.out.println("Nom de Pharmacie : "+this.nom);
		for(Patient p : this.patients.values())
		{   System.out.println("******* Patient ********");
			p.affiche();
		}
		
	}
	public Collection <String > affichePatientAvecMedicament (String m){
		Collection<String> c = new ArrayList<String>();
		for ( Patient p : this.patients.values() )
			{if(!p.ordonnanceVide() && p.contientMedicament(m))
				{c.add(p.getNom());}
			
			}
		return c ;
		
	}
    public static void main(String[] args) {
        DossierPharmacie d = new DossierPharmacie("Pharmacie de Nuit");
        
     
        d.nouveauPatient("Malak", new String[]{"Doliprame", "Aspirine"});
        d.nouveauPatient("Salah", new String[]{"Ibuprofène", "Paracétamol", "Aspirine"});
        d.nouveauPatient("Imene", new String[]{"Doliprame", "Vitamine B12"});
        System.out.println("*********************** Dossier Pahrmacie ****************************");
        d.affiche();
        System.out.println("*********************** Apres Ajouter un medicament a un patient ****************************");
        
        d.ajoutMedicament("Malak", "Vitamine C");
        d.affichePatient("MALAK");
        if (d.patients.containsKey("salah")) {
            Set<String> ord = d.patients.get("salah").trieOrdonnace();
            System.out.println("*********************** ordonnace Salah Triée *************");
            System.out.println(ord);
        } else {
            System.out.println("Le patient Salah n'existe pas dans le dossier de pharmacie.");
        }

       
        
        System.out.println("***********************Dossier apres tous les mise a jours****************************");
        d.affiche();

        Collection<String> patientsAvecAspirine = d.affichePatientAvecMedicament("Aspirine");
        System.out.println("************Patients avec Aspirine dans leur ordonnance : ************ \n " + patientsAvecAspirine);
    }
	
	
}
