package empleados;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmpleadosTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void creoUnEmpleadoPorDefaultTest() {
		Empleado juan = new Empleado();
		assertEquals(" ", juan.getNombre());
		assertEquals(0, juan.getSalario(), 0.001);
		assertNull(juan.getFechaDeNacimiento());
	}

	@Test
	public void creoUnEmpleadoParametrizadoTest() {
		Empleado ana = new Empleado("Ana", 68000, new Fecha(23, 3, 1995));
		assertEquals("Ana", ana.getNombre());
		assertEquals(68000, ana.getSalario(), 0.01);
		Fecha esperada = new Fecha(23, 3, 1995);
		assertEquals(esperada, ana.getFechaDeNacimiento());

	}

	@Test
	public void creoUnGerentePorDefaultTest() {
		Gerente pablo = new Gerente();
		assertEquals(" ", pablo.getNombre());
		assertNull(pablo.getFechaDeNacimiento());
		assertEquals(0, pablo.getSalario(), 0.001);
		assertNull(pablo.getDepartamento());
	}

	@Test
	public void creoUnGerentePorParametrosTest() {
		Gerente julia = new Gerente("Julia", 68000, new Fecha(20, 6, 1980), "Produccion");
		assertEquals("Julia", julia.getNombre());
		assertEquals(68000 * 1.2, julia.getSalario(), 0.01);
		Fecha esperada = new Fecha(20, 6, 1980);
		assertEquals(esperada, julia.getFechaDeNacimiento());
		assertEquals("Produccion", julia.getDepartamento());
		
		Gerente raul = new Gerente("Raul");
		assertEquals(0, raul.getSalario(), 0.001);
		
	}

}
