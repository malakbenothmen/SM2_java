package tp9_examenTP;

public class testEpreuve {

	public static void main(String[] args) {
		Epreuve e= new Epreuve("oral",5);
		
		Candidat c=new Candidat(010,"Malak ben othmen");
		Resultat t =new ResultatPoints();
		((ResultatPoints)t).setNBPoint(25);
		
		Candidat c1=new Candidat(001,"Malak");
		Resultat t1 =new ResultatOral();
		((ResultatOral)t1).setAppreciation('B');
		
		Candidat c2=new Candidat(002,"tes");
		Resultat t2 =new ResultatOral();
		((ResultatOral)t2).setAppreciation('M');
		
		Candidat c3=new Candidat(003,"intissar");
		Resultat t3 =new ResultatPoints();
		((ResultatPoints)t3).setNBPoint(5);
		
		
		Candidat c4=new Candidat(004,"hana");
		Resultat t4 =new ResultatPoints();
		((ResultatPoints)t4).setNBPoint(10);
		
		
		
		/*e.ajoutCandidat(c1);
		e.ajoutCandidat(c2);*/
		e.ajoutCandidat(c);
		e.ajoutCandidat(c3);
		e.ajoutCandidat(c4);
		System.out.println(e.toString());
		
		/*e.fixeResultat(001, t1);
		e.fixeResultat(002, t2);*/
		e.fixeResultat(010, t);
		e.fixeResultat(003, t3);
		e.fixeResultat(004, t4);
		
		System.out.println(e.toString());
		System.out.println("Le Meilleur Resultat est "+e.getRecord());
		
		
		
		
	}

}
