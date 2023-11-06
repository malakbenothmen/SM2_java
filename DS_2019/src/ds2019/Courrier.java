package ds2019;

public class Courrier {
 protected boolean mode;
 protected String add;
 protected final double  tarif=0.5;
 
 
 Courrier()
 {};
 Courrier(boolean m,String add)
 {this.add=add;
 this.mode=m;}
 
 boolean estVlide()
 {return this.add!="";}

 String getMode()
 {
 if(this.mode)
 return "express";
else 
 return "Normal";
 }
 
 void decrire()
 {  
	 System.out.println("Courrier de type: "+this.getClass().getSimpleName()+", adresse: "+this.add+", mode d'expedition: "+this.getMode()+", tarif: "+this.affranchir());}
 
 double affranchir()
 {double montant=0;
 if(this.estVlide())
	 {if(this.mode)
		 montant=this.tarif*2;
	 }
 else 
	 montant=this.tarif;
 return montant;}

 
 
 
 
 
}
