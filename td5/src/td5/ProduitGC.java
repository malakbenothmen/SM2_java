package td5;

 public class ProduitGC extends Article{
	
ProduitGC(long ref, String lib, float p, int q) 
{ super(ref, lib, p,q);}	


@Override
public void decrire() {
    System.out.println("Classe de l'article :"+this.getClass().getSimpleName());
    super.decrire(); 
}

public float calculPrixTTC() {
    return prixHT * (1 + TVA);
}

}