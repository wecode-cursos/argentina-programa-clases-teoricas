package biblioteca;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import biblioteca.Biblioteca;
import biblioteca.Genero;
import biblioteca.Libro;

public class BibliotecaTests {
	Biblioteca biblioteca;

	@Before
	public void setUp() {
		biblioteca = new Biblioteca();

		Libro theStand = new Libro("S. King", 1024, "Apocalipsis", 1989, Genero.FICCION);
		Libro elJoyero = new Libro("JRR Tolkien", 1320, "El Silmarillion", 1947, Genero.FANTASIA);
		Libro guerraPaz = new Libro("Tolstói", 2736, "La Guerra y La Paz", 1867, Genero.NOVELA);
		Libro mobyDick = new Libro("Melville", 2736, "Moby Dick", 1867, Genero.NOVELA);

		// Ojo, no hay validacion de size, asi que puede explotar facil aca
		biblioteca.agregarLibro(theStand);
		biblioteca.agregarLibro(elJoyero);
		biblioteca.agregarLibro(guerraPaz);
		biblioteca.agregarLibro(mobyDick);
		
		

	}

	@Test
	public void testOrdenLargoABreve() {
		biblioteca.ordenarLibrosPorPaginas();

		Libro theStand = new Libro("S. King", 1024, "Apocalipsis", 1989, Genero.FICCION);
		Libro guerraPaz = new Libro("Tolstói", 2736, "La Guerra y La Paz", 1867, Genero.NOVELA);
		
		ArrayList<Libro> libros = biblioteca.getLibros();

		assertEquals(guerraPaz, libros.get(0));
		assertEquals(theStand, libros.get(2));

	}

	@Test
	public void testOrdenApellidoAutor() {
		biblioteca.ordenarLibrosPorAutor();
		
		Libro theStand = new Libro("S. King", 1024, "Apocalipsis", 1989, Genero.FICCION);
		Libro elJoyero = new Libro("JRR Tolkien", 1320, "El Silmarillion", 1947, Genero.FANTASIA);
		Libro guerraPaz = new Libro("Tolstói", 2736, "La Guerra y La Paz", 1867, Genero.NOVELA);
		
		ArrayList<Libro> libros = biblioteca.getLibros();

		assertEquals(guerraPaz, libros.get(0));
		assertEquals(theStand, libros.get(1));
	}

	@Test
	public void testOrdenTitulo() {
		biblioteca.ordenarLibrosPorTitulo();
		
		Libro theStand = new Libro("S. King", 1024, "Apocalipsis", 1989, Genero.FICCION);
		Libro guerraPaz = new Libro("Tolstói", 2736, "La Guerra y La Paz", 1867, Genero.NOVELA);

		ArrayList<Libro> libros = biblioteca.getLibros();

		assertEquals(guerraPaz, libros.get(2));
		assertEquals(theStand, libros.get(0));
	}

	@Test
	public void testOrdenTituloNormalizado() {
		biblioteca.ordenarLibrosPorTituloNormalizado();
		
		Libro theStand = new Libro("S. King", 1024, "Apocalipsis", 1989, Genero.FICCION);
		Libro guerraPaz = new Libro("Tolstói", 2736, "La Guerra y La Paz", 1867, Genero.NOVELA);

		ArrayList<Libro> libros = biblioteca.getLibros();

		assertEquals(guerraPaz, libros.get(1));
		assertEquals(theStand, libros.get(0));
	}

	@Test
	public void testOrdenAnio() {
		biblioteca.ordenarLibrosPorAnioPublicacion();
		
		Libro theStand = new Libro("S. King", 1024, "Apocalipsis", 1989, Genero.FICCION);
		Libro guerraPaz = new Libro("Tolstói", 2736, "La Guerra y La Paz", 1867, Genero.NOVELA);

		ArrayList<Libro> libros = biblioteca.getLibros();

		assertEquals(guerraPaz, libros.get(0));
		assertEquals(theStand, libros.get(2));
	}

	@Test
	public void testLibroRepetidoNoLlenaElAlbum() {
		Libro perlita = new Libro("JRR Tolkien", 345, "El Silmarillion", 1933, Genero.FANTASIA);
		boolean esLibroRepetido = biblioteca.libroRepetido(perlita);

		assertTrue(esLibroRepetido);
	}
	
	@Test
	public void librosPorGeneroTest() {
		System.out.println(biblioteca.cantidadLibrosPorGenero());
		System.out.println(biblioteca.librosPorGenero());
	}

}
