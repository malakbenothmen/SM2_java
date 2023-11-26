package ex2;
import java.util.Scanner;
import java.io.IOException;
public class Autnetification {
	private static final String loginCorrect="scott";
	private static final String PwdCorrect="tiger";
	
	String getLogin()
	{return loginCorrect;}
	
	String getPwd()
	{return PwdCorrect;}
	
	Autnetification() throws WrongLoginException,WrongPwdException,IOException , WrongInputLength
	{  getUserLogin();
	   getUserPwd();
	}
	String getUserLogin() throws WrongLoginException, WrongInputLength
	{  Scanner sc = new Scanner(System.in);
	System.out.println("Saisir userloging :");
    	String userlog=sc.nextLine();
    	if ( userlog.length()>10)
    		throw new  WrongInputLength("login saisi depasse 10 caracteres");
		if (! this.loginCorrect.equals(userlog))
	    	throw new WrongLoginException("un login est incorrect");
		return userlog;}
	
	
	String  getUserPwd() throws WrongPwdException,WrongInputLength
	{Scanner sc = new Scanner(System.in);
	System.out.println("Saisir pwd :");
	String userpwd=sc.nextLine();
	if(userpwd.length()>10)
	      throw new  WrongInputLength("Pwd saisi depasse 10 caracteres");
	if (! PwdCorrect.equals(userpwd))
	    throw new  WrongPwdException("mot de passee est incorrect");
	return userpwd;
	}

	
	
	
}