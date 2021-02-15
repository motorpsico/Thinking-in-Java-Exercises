package cap3.pruebas_propias;

public class Aliasing {
	
	// Haciendo pruebas sobre el concepto de Aliasing de la pag. 45
	
	int value = 2;

	public static void main(String[] args) {
		
		Aliasing a = new Aliasing();
		
		Aliasing b = a, c = a, d = a;
		
		System.out.println(a.value + " " + b.value + " " + c.value);
		
		System.out.println(a == b && c == d);
		
		c.value = 30;
		
		System.out.println(a.value + " " + b.value + " " + c.value + " " + d.value);
		
		Object x = new Object();
		
		Object y = x, z = x;
		
		System.out.println(x + " " + y + " " + z);
	
		

	}

}
