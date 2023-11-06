package ds2022_mdw;

public class creature extends carte{
	private String nom;
	private int nbDegats, nbVie;
	
	
	creature(double cout,String nom,int nbd,int nbv)
	{super(cout);
	this.nom=nom;
	this.nbDegats=nbd;
	this.nbVie=nbv;}
	
	
	public String toString()
	{return "Une "+super.toString()+" "+this.nom+" "+this.nbDegats+"/"+this.nbVie;}

}
