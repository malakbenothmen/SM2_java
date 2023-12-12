package tpExamen;

public class Article {
	 private int code;
	 private String libelle;
	 private int qteStock;
	 private int stockMax;
	 
	 public Article(int code, String lib, int qte, int stoc) {
	     this.code = code;
	     this.libelle = lib;
	     this.qteStock = qte;
	     this.stockMax = stoc;
	    }
	
	 public int getQteStock() {
	     return qteStock;
	    }
	 public void setQteStock(int qte) {
	     this.qteStock = qte;
	    }
	 
	 public int getStockMax() {
	     return stockMax;
	    }
	 public String toString() {
	     return this.getClass().getSimpleName()+": code=" +this.code + ", libelle='" + this.libelle +", qteStock=" + this.qteStock + ", stockMax=" + this.stockMax;
	    }
	
	 public boolean equals(Article a) {
	     return this.code == a.code && this.libelle.equals(a.libelle);
	    }
	

}
