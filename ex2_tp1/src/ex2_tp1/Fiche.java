package ex2_tp1;

public class Fiche {
	private String nom ;
	private int numero ;
	private String addresse;
	
	
	
	Fiche (String n , String add , int num)
	{this.nom=n;
	this.addresse=add;
	this.numero=num;}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}


	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", numero=" + numero + ", addresse=" + addresse + ", getNom()=" + getNom()
				+ ", getNumero()=" + getNumero() + ", getAddresse()=" + getAddresse() + "]";
	}
	
	
	
	
	

}
