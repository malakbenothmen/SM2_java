package ds_2022;

public class JeuPrincipal {

	public static void main(String[] args) {
		Editeur Ed1=new Editeur(123,"Ubisoft","Canada");
		Editeur Ed2=new Editeur(133,"Vivendi Universal","France");
		Jeu[] Tab=new Jeu[3];
	
		Jeu J1=new Jeu("Watch dogs",2020,6,Ed1);
		Jeu J2=new Jeu("Wow",2019,12,Ed2);
		Jeu J3=new JeuMulti("Wow",2019,12,Ed2,2) ;
		/*Jeu J3=J2;
		((JeuMulti)J3).setNbjoueur(2);*/
		
		Tab[0]= J1;
		Tab[1]=J2;  
		Tab[2]=J3;
		System.out.println("****les jeu edité par vivendi ****\n");
		for(int i=0;i<3;i++)
		{if (Tab[i].getEdit().nomEdit=="Vivendi Universal")
			{Tab[i].decrire();}
		}
		
		int s=0;
		for(int i=0;i<Tab.length;i++)
		{if (Tab[i] instanceof JeuMulti)
			{s+=((JeuMulti)Tab[i]).getNbjoueur();}
		}
		System.out.println("\n**** le nombre des joueurs tolal de jeu multiple est :****\n"+s);
		
		
		
		
		
		
		

	}

}
