package ds_2020;

public class Vetement {
	protected String code;
	protected int quant;
	protected String libelle;
	protected String color;
	protected float HT;
	protected final float TVA=0.18f;
	
	Vetement (String lib, float pht, String code, String c)
	{this.libelle=lib;
	this.HT=pht;
	this.code=code;
	this.color=c;}
	
	int getQuant()
	{return this.quant;}
	
	void setQuant(int q)
	{   if(q>=0)
		this.quant=q;}
	
	public String toString()
	{return this.code+" "+this.libelle+" "+this.color+" : prixHT= "+this.HT+"DT et qté="+this.quant;}
	
	float prixTTC()
	{return this.HT*(1+this.TVA/100);}
	
	 float prixTTC (int remise)
	 {return prixTTC()*(1-remise/100);}
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	

}
