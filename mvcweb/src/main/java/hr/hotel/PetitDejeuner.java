package hr.hotel;

public class PetitDejeuner {

	private int chambre;
	private int nombreDeRepas;
	private String heure;
	private String commentaires;
	







	public PetitDejeuner(int chambre, int nbRepas, String heure, String commentaires) {
		// TODO Auto-generated constructor stub		super();
		this.chambre = chambre;
		this.nombreDeRepas = nbRepas;
		this.heure = heure;
		this.commentaires = commentaires;
	}





	@Override
	public String toString() {
		return "PetitDejeuner [chambre=" + chambre + ", nombreDeRepas=" + nombreDeRepas + ", heure=" + heure
				+ ", commentaires=" + commentaires + "]";
	}


	public int getChambre() {
		return chambre;
	}


	public int getNombreDeRepas() {
		return nombreDeRepas;
	}


	public String getHeure() {
		return heure;
	}


	public String getCommentaires() {
		return commentaires;
	}



	public void setChambre(int chambre) {
		this.chambre = chambre;
	}


	public void setNombreDeRepas(int nombreDeRepas) {
		this.nombreDeRepas = nombreDeRepas;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	

	
	
}


