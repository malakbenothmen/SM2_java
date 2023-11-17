package tpn5;

 public class Lotissement implements GestionPropriete {
	protected Proprite[] tabProp;
	protected int nombre;
	
	Lotissement()
	{}
	Lotissement(int capacite)
	{if (MAX_PROPRIETES >= capacite)
		tabProp = new Proprite[capacite];
	}
	
	 Proprite getproprieteByIndice(int i) 
	 {   if(nombre<i && i>0)
		 return this.tabProp[i];
	 else 
		 return null;}
	 
	 
	 int getnbPieces()
	 {int nb=0;
	 for(int i=0;i<this.nombre;i++)
	 {if (this.tabProp[i] instanceof ProprietePrivee)
		 nb+=((ProprietePrivee)this.tabProp[i]).getnbPiece();}
	 return nb;
	 }
	 
	 public void afficheProprietes()
	 {
	System.out.println("******** la liste des tous les proprietes ******");
	 for(int i=0;i<nombre;i++) 
	 {System.out.println(tabProp[i].toString());}
	 
	 }
	 
	public  boolean ajouter(Proprite p)
	{if(nombre< this.tabProp.length)
		{tabProp[nombre]=p;
		nombre++;
		return true;}
	else
		return false;
	}
	
	public boolean supprimer(Proprite p)
	{  int pos=0;
       while(this.tabProp[pos].equals(p)&& pos < this.tabProp.length)
       { pos++;}
       if(pos<this.tabProp.length)
        {for(int i=pos;i<this.tabProp.length-1;i++)
    	   {this.tabProp[i]=this.tabProp[i+1];}
        this.nombre--;
        return true;}
       else
    	   return false;
       
	}
	
	public Proprite moinsImpots()
	{  Proprite p=null;
		for(int i=0;i<this.tabProp.length;i++)
		{if (this.tabProp[i] instanceof ProprietePrivee)
			if (p==null)
				p=this.tabProp[i];
			else
		       {if (this.tabProp[i].calculImpot()<= p.calculImpot() )
				p=this.tabProp[i];}
		}
		return p;
				
	}
	
	
	 
	 
	 

}
