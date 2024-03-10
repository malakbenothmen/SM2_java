package revision;

public class Article {
	private int code ;
	private String libelle ;
	private int qteStock ;
	private int stockMax;
	
	
	Article (int c, String lib , int qt , int s)
	{this.code=c;
	this.libelle=lib;
	this.qteStock=qt;
	this.stockMax=s;
	}
	
	int getQteStock()
	{return this.qteStock;}
	
	void setQteStock(int qte)
	{ this.qteStock=qte;}
	int getStockMax()
	{return this.stockMax;}
	
	public String toString()
	{return " Article : code="+this.code+" libelle="+this.libelle+" quantite de stock="+this.qteStock+" stock Max="+this.stockMax;}
	
	
	boolean equals(Article A)
	{
		return this.libelle.equals(A.libelle) && this.code==A.code;
		
	}
	
	
	
	
	

}
