
package td5;

abstract public class Article {
 private long reference;
 protected String libelle;
 protected float prixHT;
 protected int qteStock;
 protected final float TVA=0.1f;

Article(long ref, String lib, float prix, int qte)
{this.reference=ref;
this.libelle=lib;
this.prixHT=prix;
this.qteStock=qte;
}
int getQteStock()
{ return this.qteStock;}

void approvisionner(int nb)
{if(nb>0)
	this.qteStock+=nb;
}

void decrire()
{System.out.println("Reference="+this.reference+" Intitulé="+this.libelle);
}


abstract float calculPrixTTC();

boolean appartientPromo()
{return  this instanceof ProduitElec || this instanceof Vetement ;}


public boolean estDispo(int qteAchat) {
    return (qteAchat >= 0 && qteAchat <= qteStock);
}

}



