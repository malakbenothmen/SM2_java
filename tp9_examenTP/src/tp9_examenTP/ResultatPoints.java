package tp9_examenTP;

public class ResultatPoints implements Resultat {
 private int nbPoint ;
 
 int getNBPoint()
 {return this.nbPoint;}
 
 void setNBPoint(int np)
 {this.nbPoint=np;}
 
 public String toString()
 {return " Nombre des Points ="+this.nbPoint;}
 

 public int compareTo(Resultat r)
 { if (r instanceof ResultatPoints)
	 {if(this.nbPoint > ((ResultatPoints)r).getNBPoint())
    	 return 1;
     else 
    	 {if (this.nbPoint == ((ResultatPoints)r).getNBPoint())
    	 return 0;
     else 
    	 return -1;
     }
	 }
 else 
	  throw new IllegalArgumentException();
 }
 
}
