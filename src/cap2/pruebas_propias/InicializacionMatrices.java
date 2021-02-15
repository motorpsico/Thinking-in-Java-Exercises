package cap2.pruebas_propias;

// Teoría de la página 26

public class InicializacionMatrices {

	public static void main(String[] args) {
		
		
		// Las matrices de primitivos se inicializan en cero
		int[] matrizDeEnteros = new int[10];
		for(int elem : matrizDeEnteros) {
			System.out.print(elem + " ");
		}
		
		System.out.println();
		
		float[] matrizDeFloat = new float[10];
		for(float elem : matrizDeFloat) {
			System.out.print(elem + " ");
		}
		
		System.out.println();
		
		// Las matrices de boolean se rellenan con valores false
		boolean[] matrizDeBoolean = new boolean[10];
		for(boolean elem : matrizDeBoolean) {
			System.out.print(elem + " ");
		}
		
		System.out.println();
		
		
		// Las matrices de char se rellenan con espacios vacíos
		char[] matrizDeChar = new char[10];
		for(char elem : matrizDeChar) {
			System.out.print(elem + " ");
		}
		System.out.print("Finalización de arreglo de char");
		System.out.println();
		
		
		// Las matrices de objetos se inicializan con valores de null
		Object[] matrizDeObject = new Object[10];
		for(Object obj : matrizDeObject)
			System.out.print(obj + " ");
		
		System.out.println(matrizDeObject[10]);
		
		System.out.println("hola mundo");
		
		


	}

}
