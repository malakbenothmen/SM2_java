package tpn5;

public class LotissementPrivee extends Lotissement {
	
	

	LotissementPrivee(int capacite){
		if (MAX_PROPRIETES >= capacite)
		   tabProp = new ProprietePrivee[capacite];
		   System.out.println("Loutissement Privée , length="+this.tabProp.length+" nombre="+nombre);
		
	}
	
	
	public boolean ajouter(Proprite p)
	{ System.out.println("je suis la ");
		if (!(p instanceof ProprietePrivee))
		  return false ;
	   else
	 		return super.ajouter(p);
	
   }
	
	ProprietePrivee getproprieteByIndice(int i) 
	{   if(nombre<i && i>0)
		 return (ProprietePrivee)tabProp[i];
	 else 
		 return null;}
	
	int getnbPieces()
	{int nb=0;
	 for(int i=0;i<this.nombre;i++)
	 { nb+=((ProprietePrivee)tabProp[i]).getnbPiece();}
	 return nb;
	 }
   
	

}



