package iset.dsi2.animalerie;

public class Chat extends Animal {
	private boolean sauvange;
	
	Chat()
	{}
    Chat(String color,int p,boolean s)
    {super(color,p);
    this.sauvange=s;
    }
    
}
