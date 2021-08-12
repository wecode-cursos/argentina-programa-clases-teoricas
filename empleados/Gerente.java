package empleados;

public class Gerente extends Empleado {

	private String departamento;

	public Gerente(String nombre, double sueldoBasico, 
			       Fecha fechaDeNacimiento, String departamento) {
		
		super(nombre, sueldoBasico, fechaDeNacimiento);

		this.departamento = departamento;
	}
	
	public Gerente(String nombre, double sueldoBasico, String departamento) {
		this(nombre, sueldoBasico, null, departamento);
	}
	
	public Gerente(String nombre) {
		this(nombre, 0, null);
	}

	public Gerente() {
		this(" ");

	}
	
	@Override
	public double getSalario() {
		return super.getSalario() * 1.2;
	}

	public String getDepartamento() {
		return this.departamento;
	}

}
