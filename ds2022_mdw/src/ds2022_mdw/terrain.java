package ds2022_mdw;

public class terrain extends carte {
	private char couleur;


terrain(char c)
{this.setCouleur(c);}

void setCouleur(char c)
{char[] tabc= {'b','B','n','v','r'};
int i=0;
while(i<tabc.length && tabc[i]!=c)
{i++;}
if (tabc[i]==c)
{this.couleur=c;}
else

	System.out.println("incorrecte color!!!!");
}

private String color()
{ String ch="";
if(this.couleur=='b')
	ch= "bleu";
if(this.couleur=='B')
	ch= "Blanc";
if (this.couleur=='n')
	ch="noir";
if (this.couleur=='r')
	ch="rouge";
if (this.couleur=='v')
	ch="vert";

return ch;
}


public String toString()
{return "Un "+super.toString()+" "+color();}



}