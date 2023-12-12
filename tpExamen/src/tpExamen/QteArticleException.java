package tpExamen;

public class QteArticleException extends Exception {
	
	QteArticleException(int nb){
		super(Message(nb));
	}
			
		
	private static String Message(int nb) {
		String msg="";
		if (nb==1)
			msg=" L’espace de stockage est insuffisant.";
		if(nb==2)
			msg=" la quantité en stock de l’article est insuffisante. !!";
		else 
			msg="entrer 1 ou 2 svp";
		return msg;
		
}
	
	
}
