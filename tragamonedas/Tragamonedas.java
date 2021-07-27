package tragamonedas;

public class Tragamonedas {

	private Tambor tamborIzquierdo;
	private Tambor tamborMedio;
	private Tambor tamborDerecho;

	/**
	 * post: los 3 Tambores del Tragamonedas están en la posición 1.
	 */
	public Tragamonedas() {
		tamborIzquierdo = new Tambor();
		tamborMedio = new Tambor();
		tamborDerecho = new Tambor();
	}

	/**
	 * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
	 */
	public void activar() {
		this.tamborIzquierdo.girar();
		this.tamborMedio.girar();
		this.tamborDerecho.girar();
	}

	/**
	 * post: indica si el Tragamonedas entrega un premio a partir de la posición de
	 * sus 3 Tambores.
	 */
	public boolean entregaPremio() {
		return (this.tamborIzquierdo.obtenerPosicion() == this.tamborMedio.obtenerPosicion()
				&& this.tamborMedio.obtenerPosicion() == this.tamborDerecho.obtenerPosicion());
	}

	public String toString() {
		return "[" + this.tamborIzquierdo.obtenerPosicion() + "]" + 
			   "[" + this.tamborMedio.obtenerPosicion() + "]" + 
			   "[" + this.tamborDerecho.obtenerPosicion() + "]";
	}

	public int simularHastaQueSalgaPremio() {
		int cantidadDeIntentos = 0;
		this.activar();

		while (!this.entregaPremio()) {
			cantidadDeIntentos++;
			this.activar();
		}
		System.out.println(this);

		return cantidadDeIntentos;
	}

	public int cuantosPremiosEntregaEnNgiros(int n) {
		int cantidadDeAciertos = 0;
		for (int i = 1; i <= n; i++) {
			this.activar();
			if (this.entregaPremio()) {
				System.out.println(this);
				cantidadDeAciertos++;
			}
		}
		return cantidadDeAciertos;

	}

}
