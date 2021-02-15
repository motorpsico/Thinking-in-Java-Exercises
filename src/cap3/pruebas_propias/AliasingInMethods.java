package cap3.pruebas_propias;

import java.util.Random;

public class AliasingInMethods {
	
	int x = 30;
	
	// El parámetro del método contiene una referencia
	// Por lo que también se repite el fenómeno de aliasing
	static void alias(AliasingInMethods dummy) {
		Random r = new Random();
		dummy.x = r.nextInt(150);
	}

	public static void main(String[] args) {
		AliasingInMethods a = new AliasingInMethods();
		AliasingInMethods b = a;
		AliasingInMethods c = b;
		
		System.out.println(a.x + " " + b.x + " " + c.x);
		
		AliasingInMethods.alias(a);
		
		System.out.println(a.x + " " + b.x + " " + c.x);
		
		AliasingInMethods.alias(c);
		
		System.out.println(a.x + " " + b.x + " " + c.x);
		
		
		
	}

}
