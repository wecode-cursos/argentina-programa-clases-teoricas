package biblioteca;

public class Libro implements Cloneable, Comparable<Libro> {
	private String autor;
	private String titulo;
	private int cantidadPaginas;
	private int anioPublicacion;
	private Genero genero;
	
	private static final int LIMITE_TITULO = 200;

	/*
	 * static{ LIMITE_TITULO=200; }
	 */
	public Libro(String autor, int cantidadPaginas, String titulo, int anioPublicacion, Genero genero) {
		this.autor = autor;
		this.cantidadPaginas = cantidadPaginas;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
		// LIMITE_TITULO=200;
	}

	public String recortarTitulo() {
		if (this.titulo.length() > LIMITE_TITULO) {
			return this.titulo.substring(0, LIMITE_TITULO);
		}
		return this.titulo;
	}

	public String getTituloNormalizado() {
		String [] tituloSeparado = this.titulo.split(" ");
		String articulo = tituloSeparado[0];
		String articuloNormalizado = articulo.toLowerCase();
		
		if (articuloNormalizado.equals("el") || articuloNormalizado.equals("la") || articuloNormalizado.equals("los")
				|| articuloNormalizado.equals("las")) {
			String tituloSinArticulo = this.titulo.substring(articulo.length());
			String tituloSinArticuloSinEspacioAtrasNiAdelante = tituloSinArticulo.trim();
			return tituloSinArticuloSinEspacioAtrasNiAdelante.concat(", " + articulo);
			//return this.titulo.substring(articulo.length()).trim().concat(", " + articulo);
		}
		return this.titulo;
	}

	public int getPaginas() {
		return this.cantidadPaginas;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getAnioPublicacion() {
		return this.anioPublicacion;
	}

	public Genero getGenero() {
		return this.genero;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.autor + " (" + this.anioPublicacion + ") " + this.genero;
	}

	@Override
	public Libro clone() throws CloneNotSupportedException {
		return (Libro) super.clone();
	}

	@Override
	public int compareTo(Libro otroLibro) {
		if (this.titulo.compareTo(otroLibro.titulo) == 0) {
			return this.autor.compareTo(otroLibro.autor);
		}
		return this.titulo.compareTo(otroLibro.titulo);
	}

}
