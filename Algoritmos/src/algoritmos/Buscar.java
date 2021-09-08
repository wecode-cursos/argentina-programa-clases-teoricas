package algoritmos;

public class Buscar {

	public static boolean estaEn(int buscado, int[] v) {
		boolean encontrado = false;
		int i = 0;

		while (!encontrado && i < v.length) {
			if (v[i] == buscado)
				encontrado = true;
			i++;
		}

		return encontrado;
	}

	public static int busquedaSecuencial(int buscado, int[] v) {

		int posicion = -1;
		int i = 0;

		while (posicion == -1 && i < v.length) {
			if (v[i] == buscado)
				posicion = i;
			i++;
		}

		return posicion;
	}

	public static int busquedaBinaria(int buscado, int[] v) {

		int posicion = -1;
		int ini = 0;
		int fin = v.length - 1;
		int medio = (fin + ini) / 2;

		while (posicion == -1 && ini <= fin) {

			if (v[medio] == buscado)
				posicion = medio;
			else if (buscado > v[medio]) {
				ini = medio + 1;

			} else if (buscado < v[medio]) {
				fin = medio - 1;

			}
			medio = (fin + ini) / 2;

		}

		return posicion;
	}

	
	
	public static int minimo(int[] v) {
		int minimo = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] < minimo)
				minimo = v[i];
		}
		return minimo;
	}
	
	public static int maximo(int[] v) {
		int maximo = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] > maximo)
				maximo = v[i];
		}
		return maximo;
	}

	
	
	
	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

			
		System.out.println(busquedaBinaria(9, v));
		
	}

}
