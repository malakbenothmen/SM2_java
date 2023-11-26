package tp6;
 class  ParametreNullException extends Exception {
	ParametreNullException(String msg){
		super(msg);
	}
}
 
 class NegatifException extends Exception {
	 NegatifException(String msg){
		 super(msg);
	 }
 }
public class Mathematique {
	private double n;
	private double x;
	
	
	
	static double f(double n,double x) throws  ParametreNullException  {
		if(n==0)
			throw new ParametreNullException("impossible de faire une division par zéro !");
	    try {
		if(x<0)
			throw new NegatifException(x+" est négatif : on ne peut pas calculer une racine pour un réel négatif !!!!!!");
	    }
	    catch (NegatifException e1)
	    {e1.printStackTrace();}
		return Math.sqrt(x)/n;
	}
	

	
	static public void main (String args[])
	{
		
		try {
		double x=Double.parseDouble(args[0]);
		double n=Double.parseDouble(args[1]);
		System.out.println( Mathematique.f(n,x));
		 }
		catch (ArrayIndexOutOfBoundsException  e)
		  { System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça \r\n"
		  		+ "fonctionne");}
		catch ( NumberFormatException e1)
		 {System.out.println(" Les arguments doivent être des nombres");
		 }
		catch (ParametreNullException e2)
		 {  
			e2.printStackTrace();
			 
		 }
		
		finally 
		{System.out.println("fin du programme");}
		
	}
	
	
	 
	
	
	
	
	

}
