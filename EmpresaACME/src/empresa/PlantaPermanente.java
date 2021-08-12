package empresa;

public class PlantaPermanente extends Empleado {

	private int aniosDeAntiguedad;
	private static double VALOR_HORA = 3000;
	private static double VALOR_ANIO_ANTIGUEDAD = 1000;

	public PlantaPermanente(int horasTrabajadas, int cantHijos, boolean casado, int aniosDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado);
		this.aniosDeAntiguedad = aniosDeAntiguedad;

	}

	@Override
	public double getSalario() {
		return this.aniosDeAntiguedad * PlantaPermanente.VALOR_ANIO_ANTIGUEDAD +
				super.getHorasTrabajadas() * PlantaPermanente.VALOR_HORA +
				super.getSalarioFamiliar();
	}

	protected int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

}
