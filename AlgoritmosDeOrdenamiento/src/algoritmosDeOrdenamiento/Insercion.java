package algoritmosDeOrdenamiento;

public class Insercion {

	public static void insercion(Integer arreglo[]) {
		int i, j;
		Integer aux;
		for (i = 1; i < arreglo.length; i++) {
			aux = arreglo[i];
			j = i - 1;
			while ((j >= 0) && (arreglo[j] > aux)) {
				arreglo[j+1] = arreglo[j];
				j--;
			}
			arreglo[j+1] = aux;
		}
	}
	
	
	public static void insercionB(Integer arreglo[]) {
		int i, j;
		Integer aux;
		
		/*/Pongo un centinela con una pasada de burbujeo que coloca al 
		 * elemento menor en la primera posicion del arreglo.
		*/
		for (int k = arreglo.length - 1; k > 0; k--) {
			if (arreglo[k] < arreglo[k - 1]) {
				aux = arreglo[k];
				arreglo[k] = arreglo[k - 1];
				arreglo[k - 1] = aux;
			}
		}
				
		for (i = 1; i < arreglo.length; i++) {
			aux = arreglo[i];
			j = i - 1;
			while (arreglo[j] > aux) {
				arreglo[j+1] = arreglo[j];
				j--;
			}
			arreglo[j+1] = aux;
		}
	}
}
