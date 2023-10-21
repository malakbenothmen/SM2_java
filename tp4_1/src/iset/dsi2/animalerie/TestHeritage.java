package iset.dsi2.animalerie;

public class TestHeritage {

	public static void main(String[] args) {
		Animal T[]=new Animal[3];
		T[0]=new Animal();
		T[1]=new Chat("blanc",30,false);
		T[2]=new Chien("noir",40,"france");
		Animal a=new Animal();
		for(int i=0;i<T.length;i++)
		{  if(T[i].getClass().getSimpleName().equals(a.getClass().getSimpleName()))
		   {System.out.println("l'espèce de cet animal est inconnue");}
		
		T[i].decrisToi();
		T[i].manger();
		T[i].boire();
		T[i].crier();
		System.out.println("**********");}
		}

	}


