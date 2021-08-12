package empleados;

public class Empleado {

	private String nombre;
	private double sueldoBasico;
	private Fecha fechaDeNacimiento;

	public Empleado(String nombre, double sueldoBasico, Fecha fechaDeNacimiento) {
		this.nombre = nombre;
		this.sueldoBasico = sueldoBasico;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Empleado(String nombre, double sueldoBasico) {
		this(nombre, sueldoBasico, null);
	}
	
	public Empleado(String nombre) {
		this(nombre, 0);
	}
	
	public Empleado() {
		this(" ");
	}

	public double getSalario() {
		return sueldoBasico;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Fecha getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

}
