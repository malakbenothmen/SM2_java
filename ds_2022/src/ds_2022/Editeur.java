package ds_2022;

public class Editeur {
long code;
String nomEdit;
String paysEdit;

public Editeur(long code, String nomEdit, String paysEdit) {
this.code = code;
this.nomEdit = nomEdit;
this.paysEdit = paysEdit;
}


public String toString() {
	return "|| code="+this.code+" nom d'editeur="+this.nomEdit+" pays d'editeur="+this.paysEdit+" ||";
}




}
