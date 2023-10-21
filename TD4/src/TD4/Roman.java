package TD4;

public class Roman extends Livre {
	private String auteur,editeur;
	Roman()
	{}
	Roman(String title,String d,int id,int nb,String aut,String edit)
	{super(title,d,id,nb);
	this.auteur=aut;
	this.editeur=edit;}

@Override
public String toString()
{return super.toString()+", Auteur: "+this.auteur+", Editeur: "+this.editeur ;
}

double calculePrix()
{return (0.05*super.nbPage)*(1+super.TVA);
}

}
