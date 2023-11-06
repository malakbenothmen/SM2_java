package ds_2020;

public class VetementEnfant extends Vetement {
	private float age;
	
	VetementEnfant(String code,String lib, float pht, String c,float age)
	{super(code,lib,pht,c);
	this.age=age;}
	
	
	void setAge(float age)
	{if(age>0)
		{this.age=age;}}
	
	
	
	public String toString()
	{return super.toString()+" Age="+this.age;
	}
	
	
	float prixTTC(int remise)
	{if(remise<50)
			return super.prixTTC(remise);
	else
		   return super.prixTTC();
	}
	
}
