package empresa;

public class Empresa {

	private Empleado empleados[];
	private int cantEmpleados;
	private int posicion = 0;

	public Empresa(int cantEmpleados) {
		this.empleados = new Empleado[cantEmpleados];
		this.cantEmpleados = cantEmpleados;
	}

	public void agregarEmpleado(Empleado e) {
		if (posicion < this.cantEmpleados) {
			this.empleados[posicion] = e;
			posicion++;
		}
		else 
			throw new Error("No hay mas lugar");
	}

	public double montoTotal() {
		double totalSueldos = 0;

		for (int i = 0; i < posicion; i++) {
			totalSueldos += empleados[i].getSalario();
			
		}

		return totalSueldos;
	}

}