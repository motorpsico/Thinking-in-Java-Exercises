package cap3.pruebas_propias;

public class AutoIncrement {
	
	static void method(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		int a = 4;
		int b;
//		method(++a);
//		System.out.println(a);
		
		for(int i = 0; i < 5 ; i++) {
			b = a++ + 1 * 3;
		}
		
	}

}
