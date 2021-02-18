package cap3.pruebas_propias;

import java.util.Random;

public class Cortocircuito {
	
	Random aleatorio = new Random();
	
	boolean f1() {
		boolean bool = aleatorio.nextBoolean();
		System.out.println("f1 " + bool);
		return bool;
	}
	
	boolean f2() {
		boolean bool = aleatorio.nextBoolean();
		System.out.println("f2 " + bool);
		return bool;
	}
	
	boolean f3() {
		boolean bool = aleatorio.nextBoolean();
		System.out.println("f3 " + bool);
		return bool;
	}
	

	public static void main(String[] args) {
		
		Cortocircuito c = new Cortocircuito();
		
		boolean result = c.f1() && c.f2() && c.f3();
		System.out.println("El resultado de la expresi�n && es : " + result);
		
		boolean result1 = c.f1() || c.f2() || c.f3();
		System.out.println("El resultado de la expresi�n || es: " + result1);

		// El cortocircuito de una expresi�n booleana significa que
		// se ir�n evaluando las subexpresiones sucesivamente hasta
		// que se pueda determinar de forma no ambig�a el resultado
		// de la expresi�n completa. Esto significa que muchas subexpresio
		// nes pueden no evaluarse nunca. El objetivo de esta caracter�stica
		// es mejorar la velocidad del programa.
		
	}

}
