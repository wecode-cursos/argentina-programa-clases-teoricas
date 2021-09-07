package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca implements Cloneable {
	
	private ArrayList<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void ordenarLibrosPorPaginas() {
		Collections.sort(this.libros, new OrdenadorPorPaginas());
	}

	public void ordenarLibrosPorAutor() {
		Collections.sort(this.libros, Collections.reverseOrder(new OrdenadorPorAutor()));
	}
		

	public void ordenarLibrosPorTitulo() {
		Collections.sort(this.libros, new OrdenadorPorTitulo());
	}

	public void ordenarLibrosPorTituloNormalizado() {
		Collections.sort(this.libros, new OrdenadorPorTituloNormalizado());
	}

	public void ordenarLibrosPorAnioPublicacion() {
		Collections.sort(this.libros, new OrdenadorPorAnioPublicacion());
	}

	public Map<Genero,Integer> cantidadLibrosPorGenero() {
		
		Map<Genero,Integer> librosPorGenero = new HashMap<Genero, Integer>();

		for (Libro libro : this.libros) {
			Genero k = libro.getGenero();
			
			if(librosPorGenero.containsKey(k)) {
				Integer v = librosPorGenero.get(k) + 1; 
				librosPorGenero.put(k, v);
			}
			else {
				librosPorGenero.put(k, 1);
			}
				
		}
		
		return librosPorGenero;
	}
	
public Map<Genero,ArrayList<Libro>> librosPorGenero() {
		
		Map<Genero,ArrayList<Libro>> librosPorGenero = new HashMap<Genero, ArrayList<Libro>>();

		for (Libro libro : this.libros) {
			Genero k = libro.getGenero();
			
			if(librosPorGenero.containsKey(k)) {
				librosPorGenero.get(k).add(libro); 
			}
			else {
				ArrayList<Libro> l = new ArrayList<Libro>();
				l.add(libro);
				librosPorGenero.put(k, l);
			}
				
		}
		
		return librosPorGenero;
	}

	public boolean libroRepetido(Libro libro) {
		return libros.contains(libro);
	}

	@Override
	public Biblioteca clone() throws CloneNotSupportedException {
		Biblioteca biblioteca = (Biblioteca) super.clone();
		
		/*for (int i = 0; i < biblioteca.getLibros().size(); i++) {
			biblioteca.getLibros().set(i,this.getLibros().get(i).clone());
		}
		*/
		
		for(Libro cl : this.libros)
			biblioteca.agregarLibro(cl.clone());
		
		return biblioteca;
	}
}
