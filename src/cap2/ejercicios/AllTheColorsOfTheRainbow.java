package cap2.ejercicios;

// Ejercicio 11

public class AllTheColorsOfTheRainbow {
	
	int anIntegerRepresentingColors = 10;

	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
	}
	
	public static void main(String[] args) {
		AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
		rainbow.changeTheHueOfTheColor(180);
	}

}
