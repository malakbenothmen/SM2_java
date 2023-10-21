package tp4_1;

public class test {

	public static void main(String[] args) {
		PointCol p=new PointCol('p',2,5,"red");
		p.afficher();
		System.out.println("****apres la modification ****\n");
		p.setColor("green");
		p.afficher();
		
	}

}
