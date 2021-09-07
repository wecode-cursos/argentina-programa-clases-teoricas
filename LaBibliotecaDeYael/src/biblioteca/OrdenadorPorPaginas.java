package biblioteca;

import java.util.Comparator;

public class OrdenadorPorPaginas implements Comparator<Libro> {

	@Override
	public int compare(Libro libro, Libro otroLibro) {
		return Integer.compare(libro.getPaginas(), otroLibro.getPaginas()) * -1;
	}

}
