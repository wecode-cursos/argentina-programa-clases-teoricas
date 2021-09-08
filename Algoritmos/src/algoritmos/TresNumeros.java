package algoritmos;

/*Leer tres valores numéricos enteros, indicar cual es el mayor, cual es el del medio 
y cual el menor. Considerar que los tres valores son diferentes.
*/

public class TresNumeros {

	public static String mayorMedioMenor(int a, int b, int c) {
		int mayor;
		int medio;
		int menor;

		mayor = a;

		if (b > mayor) {
			medio = mayor;
			mayor = b;
		} else
			medio = b;

		if (c > mayor) {
			menor = medio;
			medio = mayor;
			mayor = c;
		} else if (c > medio) {
			menor = medio;
			medio = c;
		} else
			menor = c;

		return "Mayor: " + mayor + "\n" + "Medio: " + medio + "\n" + "Menor: " + menor;
	}

	public static void main(String[] args) {
		System.out.println(mayorMedioMenor(10, 3, 4));

	}

}
