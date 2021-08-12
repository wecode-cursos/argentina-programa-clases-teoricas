package empresa;

public abstract class Empleado {
	private int horasTrabajadas;
	private int cantHijos;
	private boolean casado;
	private static double VALOR_HIJO = 2000;
	private static double VALOR_CONYUGE = 1000;

	public abstract double getSalario();

	public double getSalarioFamiliar() {
		double salarioFamiliar = this.cantHijos * VALOR_HIJO;
		if (this.casado)
			salarioFamiliar += VALOR_CONYUGE;

		return salarioFamiliar;
	}

	public Empleado(int horasTrabajadas, int cantHijos, boolean casado) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.cantHijos = cantHijos;
		this.casado = casado;
	}
	
	protected int getHorasTrabajadas() {
		return horasTrabajadas;
	}

}