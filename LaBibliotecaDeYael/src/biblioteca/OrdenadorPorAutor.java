package biblioteca;

import java.util.Comparator;

public class OrdenadorPorAutor implements Comparator<Libro> {

	@Override
	public int compare(Libro libro, Libro otroLibro) {
		return libro.getAutor().compareTo(otroLibro.getAutor());
	}

}
