package arreglos;

import java.util.Arrays;

public class Arreglos {

	public char[] crearCharArray() {
		char[] s;
		s = new char[26];
		/*
		 * for (int i = 0; i < 26; i++) { s[i] = (char) ('A' + i); }
		 */
		return s;
	}

	public int[] crearIntArray() {
		int[] enteros;
		enteros = new int[10];
		for (int i = 0; i < 10; i++) {
			enteros[i] = +i;
		}

		return enteros;
	}

	public Punto[] crearPuntoArray() {
		Punto[] puntos = new Punto[10];
		for (int i = 0; i < 10; i++) {
			puntos[i] = new Punto(i, i + 1);
		}

		return puntos;
	}

	public static void main(String[] args) {
		Arreglos arr = new Arreglos();
		char[] abcd = arr.crearCharArray();

		for (int i = 0; i < abcd.length; i++) {
			System.out.println(abcd[i]);
		}

		int[] aEnteros = arr.crearIntArray();

		for (int i = 0; i < aEnteros.length; i++) {
			System.out.println(aEnteros[i]);
		}

		Punto[] puntos = new Punto[10];

		for (int i = 0; i < puntos.length; i++) {
			puntos[i] = new Punto(i,i+1);
		}

		Punto[] otrosPuntos = Arrays.copyOfRange(puntos, 0, puntos.length);
		for (Punto punto : otrosPuntos) {
			System.out.println(punto);
		}
		
		
	}

}
