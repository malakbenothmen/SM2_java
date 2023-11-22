package td5;

 public class Vetement extends ProduitGC implements Promotion {
	
	private String couleur;
	private String taille;

	Vetement(long ref, String lib, float p, int q, String c, String taille) {
        super(ref,lib,p,q);
        this.couleur = c;
        this.taille = taille;
    }

	 public void decrire() {
	        super.decrire(); 
	        System.out.println("Couleur : " + couleur+" , Taille : " + taille);
	 }    
	 public float prixDeVente(String dateStr)
	 {if (estPeriodePromo(dateStr)) 
	      return prixHT * (1 - 0.3f); 
	 else 
	       return super.calculPrixTTC();
	       
	 }
	 
	 

}
