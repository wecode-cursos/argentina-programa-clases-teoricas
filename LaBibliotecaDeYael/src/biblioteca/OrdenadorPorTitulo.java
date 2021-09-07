package biblioteca;

import java.util.Comparator;

public class OrdenadorPorTitulo implements Comparator<Libro> {

	@Override
	public int compare(Libro libro, Libro otroLibro) {
		return libro.getTitulo().compareTo(otroLibro.getTitulo());
	}

}
