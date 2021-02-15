package cap2.ejercicios;

public class Autoboxing {

	public static void main(String[] args) {
		
		// Autoboxing(Autoempaquetado) es una característica de Java
		// que permite asignarle a un objeto wrapper su valor en primitivo
		// directamente.
		
		Character c = 'A';
		Boolean bool = true;
		Integer inte = 180;
		Float f = 180.0f;
		Double d = 180.0;
		Long l = 10000L;
		Byte b = 12;
		Short s = 1500;
		
		//AUTOUNBOXING (autodesempaquteado) es la característica anterior
		// en sentido inverso
		
		char ch = c;
		boolean bo = bool;
		int i = inte;
		float fl = f;
		double db = d;
		long lg = l;
		byte by = b;
		short sh = s;
		
		System.out.print((int)ch);
		

	}

}
