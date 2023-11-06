package ds_2022;

public class Jeu {
private long idJeu;
static int count;
private String nom;
private int ann;
private int nbtotal ;
private int minage;
private Editeur edit;


Jeu(){
count++;
this.idJeu=count;}


Jeu(Editeur e)
{
	count++;
	this.idJeu=count;
	this.nbtotal++;
	this.edit=e;
}

Jeu(String nom, int annee, int ageMin, Editeur edit)
{
	this(edit);
	this.nom=nom;
	this.ann=annee;
	this.minage=ageMin;
}

Editeur getEdit()
{return this.edit;}

void decrire()
{System.out.println(this.getClass().getSimpleName()+" id="+this.idJeu+" name="+this.nom+" Année d'edition="+this.ann+" Age minimum="+this.minage+" Editeur="+this.edit);}



}
