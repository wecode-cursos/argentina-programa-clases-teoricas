package empresa;

public class Gerente extends PlantaPermanente {
	
	private static double VALOR_HORA = 4000;
	private static double VALOR_ANIO_ANTIGUEDAD = 1500;
	
	public Gerente(int horasTrabajadas, int cantHijos, boolean casado, int aniosDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado, aniosDeAntiguedad);
	}
	
	@Override
	public double getSalario() {
		return this.getAniosDeAntiguedad() * Gerente.VALOR_ANIO_ANTIGUEDAD +
				super.getHorasTrabajadas() * Gerente.VALOR_HORA +
				super.getSalarioFamiliar();
	}
	
	
	

}
