package tragamonedas;

public class Tambor {
	private int posicion;

	/**
	 * post: inicialmente el Tambor está en la posición 1.
	 */
	public Tambor() {
		posicion = 1;
	}

	/**
	 * post: devuelve el número de posición en la que se encuentra el Tambor. Es un
	 * valor comprendido entre 1 y 8.
	 */
	public int obtenerPosicion() {
		return posicion;
	}

	/**
	 * post: hace girar el tambor y luego se detiene en una posición comprendida
	 * entre 1 y 8.
	 */
	public void girar() {

		/* provee un número aleatorio en el rango [0.0, 1.0) */
		double aleatorio = Math.random();

		posicion = (int) (aleatorio * 8) + 1;
	}

}
