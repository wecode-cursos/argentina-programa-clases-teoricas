package biblioteca;

import java.util.Comparator;

public class OrdenadorPorTituloNormalizado implements Comparator<Libro> {

	@Override
	public int compare(Libro libro, Libro otroLibro) {
		return libro.getTituloNormalizado().compareTo(otroLibro.getTituloNormalizado());
	}

}
