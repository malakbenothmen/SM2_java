package tp2;


public class Cercle {
	char nom;
	point centre;
	double r;
	
	Cercle(point con,double rayon)
	{ centre=con;
	r=rayon;
	}
	void afficher()
	{ System.out.println( "cercle  de centre "+centre+ "\n de Rayon :"+r);}
    
	void deplacer(int a,int b)
    {centre.deplacer(a,b);
    }

    static boolean coincide(Cercle c1,Cercle c2)
    {return c1.centre.coïncide_V1(c2.centre) && c1.r==c2.r;}

}


