package algoritmosDeOrdenamiento;

public class Seleccion {

	public static void seleccion(Integer[] arreglo) {
		int posMax;
		Integer aux;
		for (int i = arreglo.length - 1; i > 0; i--) {
			posMax = 0;
			for (int j = 0; j <= i; j++) {
				if (arreglo[j] > arreglo[posMax]) {
					posMax = j;
				}
			}
			aux = arreglo[i];
			arreglo[i] = arreglo[posMax];
			arreglo[posMax] = aux;
		}
	}
	
	public static void seleccionMin(Integer[] arreglo) {
		int posMin;
		Integer aux;
		for (int i = 0; i < arreglo.length-1; i++) {
			posMin = i;
			for (int j = i+1 ; j <= arreglo.length-1; j++) {
				if (arreglo[j] < arreglo[posMin]) {
					posMin = j;
				}
			}
			//intercambio la posición de i con la posición del mínimo. 
			aux = arreglo[i];
			arreglo[i] = arreglo[posMin];
			arreglo[posMin] = aux;
		}
	}
}
