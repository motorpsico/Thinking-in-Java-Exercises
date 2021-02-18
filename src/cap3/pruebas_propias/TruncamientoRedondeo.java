package cap3.pruebas_propias;

public class TruncamientoRedondeo {
	
	/*
	 * El casting de tipos decimales a tipos enteros, puede utlizarse 
	 * como función de truncamiento. No redondea, quita la 
	 * parte decimal cualquiera sea el valor.
	 */
	
	void truncamiento(float f, double d) {
			
		int a = (int) f;
		long b = (long) d;
		
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		
		TruncamientoRedondeo t = new TruncamientoRedondeo();
		t.truncamiento(180.18943f, 2500.38);
		
		t.truncamiento(180.9999f, 2500.65);
		
		
		
		

	}

}
