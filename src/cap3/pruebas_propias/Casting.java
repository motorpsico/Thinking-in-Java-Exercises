package cap3.pruebas_propias;

public class Casting {
	
	
	void charCasting(char ch) {
			
			// Si quiero convertir un tipo de dato char a un tipo de dato primitivo
			// numérico, como char es un tipo de dato no numérico requiere el operador de 
			// casting para el respectivo tipo al que se quiere convertir.
		
		   char x1 = ch;
		   byte x2 = (byte)ch;
		   short x3 = (short)ch;
		   int x4 = (int)ch;
		   long x5 = (long)ch;
		   float x6 = (float)ch;
		   double x7 = (double)ch;
		   
		   System.out.println(x1 + " " + x2 + " " + x3 + " " +x4 + " " + x5 + " " + x6 +
				   " " + x7);
	}
	
	void wideningCastingByte(byte b) {
		
		// Cuando se asigna un byte a un tipo de dato primitivo de mayor capacidad
		// no require casting.
		
		char x1 = (char)b;
		byte x2 = b;
		short x3 = b;
		int x4 = b;
		long x5 = b;
		float x6 = b;
		double x7 = b;
		System.out.println(x1 + " " + x2 + " " + x3 + " " +x4 + " " + x5 + " " + x6 +
				   " " + x7);
		
	}
	
	
	void narrowingCastingToByte(char ch, byte b, short c, int d, long e,
			float f, double g) {
		
		byte x1 = (byte)ch;
		byte x2 = b;
		byte x3 = (byte)c;
		byte x4 = (byte)d;
		byte x5 = (byte)e;
		byte x6 = (byte)f;
		byte x7 = (byte)g;
		
		
		System.out.println(x1 + " " + x2 + " " + x3 + " " +x4 + " " + x5 + " " + x6 +
				   " " + x7);
		
	}
	
	
	void shortCasting(short sh) {
		
		// Tipo numérico a char requiere casting obligatorio
		char x1 = (char)sh;
		
		// Se quiere asignar un short a byte require casting obligatorio
		// dado que byte puede albergar menos información
		byte x2 = (byte)sh;
		
		// El tipo de x3 es short no requiere casting
		short x3 = sh;
		
		// Acá se produce widening casting (conversión de ensachamiento)
		// el casting no es obligatorio, el compilador lo hace 
		// automáticamente
		int x4 = sh;
		long x5 = sh;
		float x6 = sh;
		double x7 = sh;
		
		System.out.println(x1 + " " + x2 + " " + x3 + " " +x4 + " " + x5 + " " + x6 +
				   " " + x7);
		
		
	}
	
	void intCasting(int i) {
		
		char x1 = (char) i;
		byte x2 = (byte) i;
		short x3 = (short) i;
		int x4 = i;
		long x5 = i;
		float x6 = i;
		double x7 = i;
		
		System.out.println(x1 + " " + x2 + " " + x3 + " " +x4 + " " + x5 + " " + x6 +
				   " " + x7);
		
	}
	
	void floatCasting(float f) {
		
		// Conversión a caracter operador casting obligatorio
		char x1 = (char) f;
		
		// Conversión a tipos de datos más chicos operador casting
		// obligatorio
		byte x2 = (byte) f;
		short x3 = (short) f;
		int x4 = (int)f;
		long x5 =(long)f;
		
		// Mismo tipo de dato no se requiere operador de conversión
		float x6 = f;
		
		// Widening casting (conversión de ensanchamiento) el compi
		//lador lo hace automáticamente.
		double x7 = f;
		
		System.out.println(x1 + " " + x2 + " " + x3 + " " +x4 + " " + x5 + " " + x6 +
				   " " + x7);
	}
	
	void doubleCasting(double d) {
		
		
		// Tipos de datos más chicos que double se requiere operador
		// de casting (narrowing Casting) (Conversión de estrechamiento)
		char x1 = (char) d;
		byte x2 = (byte) d;
		short x3 = (short) d;
		int x4 = (int)d;
		long x5 = (long)d;
		float x6 = (float)d;
		
		
		// Mismo tipo de dato no se requiere operador casting
		double x7 = d;
		
		System.out.println(x1 + " " + x2 + " " + x3 + " " +x4 + " " + x5 + " " + x6 +
				   " " + x7);
		
		
	}
	
	void booleanCasting (boolean b) {
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		Casting c = new Casting();
		c.charCasting('a');
		
		// Cada vez que se escribe un literal entero, Java sobreentiende que
		// se trata de un tipo de dato "int" por lo que hay que castear
//		// c.wideningCastingByte((byte)-10);
		//c.narrowingCastingToByte('a', (byte)-10,(short) 50, 789, 100, 4.5f, 85.2);
		
		c.shortCasting((short)180);
		

	}

}
