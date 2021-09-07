package biblioteca;

import java.util.Comparator;

public class OrdenadorPorAnioPublicacion implements Comparator<Libro> {

	@Override
	public int compare(Libro libro, Libro otroLibro) {
		return Integer.compare(libro.getAnioPublicacion(), 
				otroLibro.getAnioPublicacion());
	}

}
