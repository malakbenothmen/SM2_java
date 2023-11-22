package td5;

 public class ProduitElec extends Article implements Promotion  {
	
	private String categorie;

 
    public ProduitElec(long ref, String lib, float p, int q, String catg) {
        super(ref,lib,p,q);
        setCategorie(catg);
    }
    
    void setCategorie(String catg)
    {if (catg.equalsIgnoreCase("TV")  || catg.equalsIgnoreCase("electroménager") || catg.equalsIgnoreCase("Telephone") || catg.equalsIgnoreCase("ordinateurs"))
    	this.categorie=catg;
    else 
    	System.out.println("cette Categorie n'existe pas ");}
    
    
    float calculPrixTTC()
    {return prixHT * (1.08f + TVA);}
   
    @Override
    public void decrire() {
        System.out.println("Classe de l'article :"+this.getClass().getSimpleName());
        super.decrire();
        System.out.println("Catégorie : " + categorie);
    }
    
    public float prixDeVente(String dateStr)
    {    if (estPeriodePromo(dateStr)) 
            return prixHT * (1 - 0.2f) * 1.08f;
        else {
            
            return this.calculPrixTTC();
        }
    }
}
