package cap2.ejercicios;

public class Estatico {
	
	static int camp = 110;
	
	public Estatico() {
		
	}

	public static void main(String[] args) {
		
		// Los objetos comparten el valor de la variable de clase
		// camp
		
		Estatico e1 = new Estatico();
		Estatico e2 = new Estatico();
		
		System.out.println(e1.camp + " ");
		System.out.println(e2.camp + " ");
		System.out.println(Estatico.camp + " ");
		
		e2.camp = 330;
		
		System.out.println(e1.camp + " ");
		System.out.println(e2.camp + " ");
		System.out.println(Estatico.camp + " ");
		
		

	}

}
