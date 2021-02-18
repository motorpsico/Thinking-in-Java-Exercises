package cap3.pruebas_propias;
import java.util.Random;

public class Relacionales {
	
	Random a = new Random();
	
	void prueba1() {
		int b = a.nextInt(); 
		short c = (short)a.nextInt(3500);
		byte d = (byte)a.nextInt(127);
		System.out.println(b < c && c > d);
	}
	
	public static void main(String[] args) {
		
		
		
		
		

	}

}
