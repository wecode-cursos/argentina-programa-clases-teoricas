package algoritmosDeOrdenamiento;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlgoOrdenamientosTest {

	Integer[] v = { 76, -6, 1, 4, 5, 7, 8, 2, 3, -1, 12, -6 };
	Integer[] ordenado = { -6, -6, -1, 1, 2, 3, 4, 5, 7, 8, 12, 76 };
	Integer[] repetido = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	Integer[] repetidoOrdenado = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void seleccionTest() {
		Seleccion.seleccion(v);
		for (Integer num : v)
			System.out.println(num);
		assertArrayEquals(ordenado, v);
	}

	@Test
	public void seleccionRepetidosTest() {
		Seleccion.seleccion(v);
		assertArrayEquals(repetidoOrdenado, repetido);
	}

	@Test
	public void seleccionMinTest() {
		Seleccion.seleccionMin(v);
		for (Integer num : v)
			System.out.println(num);
		assertArrayEquals(ordenado, v);
	}

	@Test
	public void seleccionMInRepetidosTest() {
		Seleccion.seleccionMin(v);
		assertArrayEquals(repetidoOrdenado, repetido);
	}

	@Test
	public void burbujeoTest() {
		Burbujeo.burbujeo(v);
		for (Integer num : v)
			System.out.println(num);
		assertArrayEquals(ordenado, v);
	}

	@Test
	public void burbujeoRepetidosTest() {
		Burbujeo.burbujeo(v);
		assertArrayEquals(repetidoOrdenado, repetido);
	}

	@Test
	public void burbujeoWTest() {
		Burbujeo.burbujeoW(v);
		for (Integer num : v)
			System.out.println(num);
		assertArrayEquals(ordenado, v);
	}

	@Test
	public void burbujeoWRepetidosTest() {
		Burbujeo.burbujeoW(v);
		assertArrayEquals(repetidoOrdenado, repetido);
	}

	@Test
	public void insercionTest() {
		Insercion.insercion(v);
		for (Integer num : v)
			System.out.println(num);
		assertArrayEquals(ordenado, v);
	}

	@Test
	public void insercionRepetidosTest() {
		Insercion.insercion(v);
		assertArrayEquals(repetidoOrdenado, repetido);
	}

	@Test
	public void insercionBTest() {
		Insercion.insercionB(v);
		for (Integer num : v)
			System.out.println(num);
		assertArrayEquals(ordenado, v);
	}

	@Test
	public void insercionBRepetidosTest() {
		Insercion.insercionB(v);
		assertArrayEquals(repetidoOrdenado, repetido);
	}

}
