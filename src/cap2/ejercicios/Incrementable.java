package cap2.ejercicios;

// Ejercicio 7

class StaticTest {
	static int i = 47;
}

class Incrementable {

	static void increment() {
		StaticTest.i++;
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 500; i++)
			Incrementable.increment();
		
		System.out.println(StaticTest.i);

	}

}
