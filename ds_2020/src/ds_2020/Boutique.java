package ds_2020;

public class Boutique {
	private Vetement[] tabVet;
	private String nom;
	private int nbVet;
	
	Boutique(String n,int taille)
	{
		this.nom=n;
		this.tabVet=new Vetement[taille];
	}
	
	void ajoutVetement(Vetement v)
	{if(this.nbVet<this.tabVet.length)
		{this.tabVet[nbVet]=v;
		nbVet++;}
	else
		{System.out.println("Boutique pleine");
		return;}
		}
	
	void afficheStock(int remise)
	{   for(int i=0;i<this.nbVet;i++)
		if(tabVet[i].getQuant()>0)
			{System.out.println(tabVet[i].toString());
			System.out.println("\n*********\n");
			}
	}
	
	public static void main(String[] args) {
		Boutique b=new Boutique("boutique",50);
		Vetement v1=new Vetement("R100","Robe",29.900f,"rouge");
		v1.setQuant(10);
		Vetement v2=new VetementEnfant("M200","Manteau",169.900f,"rouge",0.5f);
		v2.setQuant(5);
		b.ajoutVetement(v1);
		b.ajoutVetement(v2);
		b.afficheStock(20);
		
		
		
		
		

	}

}
