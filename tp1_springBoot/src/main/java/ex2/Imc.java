package ex2;

public class Imc {
 double p,t;
 
 public Imc(double taille, double poids)
 {
	 this.p=poids;
	 this.t =taille;
 }
 
 
 double calcul()
 {
	 return this.p/(this.t*this.t);
 }


public double getP() {
	return p;
}


public void setP(double p) {
	this.p = p;
}


public double getT() {
	return t;
}


public void setT(double t) {
	this.t = t;
}
 
 
 
}
