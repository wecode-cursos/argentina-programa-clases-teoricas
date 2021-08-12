package empresa;

public class PlantaTemporaria extends Empleado {
	private static double VALOR_HORA = 2000;
	
	public PlantaTemporaria(int horasTrabajadas, int cantHijos, boolean casado) {
		super(horasTrabajadas, cantHijos, casado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalario() {
		return super.getHorasTrabajadas() * 
				PlantaTemporaria.VALOR_HORA + 
				super.getSalarioFamiliar();
		
	}

}
