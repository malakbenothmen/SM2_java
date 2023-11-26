package ex2;
import java.io.IOException;
public class TestAuthentification {

	public static void main(String[] args) {
		boolean erreur=false;
		
		do {
		try
		{ Autnetification a=new Autnetification();
		erreur=true;}
		catch ( WrongInputLength e1)
		{e1.printStackTrace();}
		catch ( WrongLoginException e)
		{e.printStackTrace();}
		catch (WrongPwdException e)
		{e.printStackTrace();}
		catch (IOException e) {
            System.out.println("Erreur d'entrée/sortie : " + e.getMessage());
            System.exit(0);}
		finally
		{System.out.println("fin du programme");}
		
		}while (erreur==false);

		

		

	}

}
