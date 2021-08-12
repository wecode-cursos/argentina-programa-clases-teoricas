package empresa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/*
 * 	a)Un empleado de Planta Temporaria con 80 horas trabajadas, 
 * 		con esposa y sin hijos.
	b)Un empleado de Planta Permanente (que no sea gerente) 
		con 80 horas trabajadas, con esposa, 2 hijos y 6 años de antigüedad.
	c)Un empleado de Planta Permanente (que no sea gerente) 
		con 160 horas trabajadas, sin esposa, sin hijos y con 4 años de antigüedad.
	d)Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de antigüedad.

*/

public class EmpresaTest {

		@Test
		public void aTest() {
			PlantaTemporaria pepe = new PlantaTemporaria(80, 0, true);
			double esperado = 161000;
			double obtenido = pepe.getSalario();
			assertEquals(esperado,obtenido,0.001);
			
		}
		
		@Test
		public void bTest() {
			Empleado pedro = new PlantaPermanente(80, 2, true, 6);
			double esperado = 251000 ;
			double obtenido = pedro.getSalario();
			assertEquals(esperado,obtenido,0.001);
			
		}
		
		@Test
		public void cTest() {
			Empleado ana = new PlantaPermanente(160, 0, false, 4);
			double esperado = 484000;
			double obtenido = ana.getSalario();
			assertEquals(esperado,obtenido,0.001);
			
		}
		
		@Test
		public void dTest() {
			Empleado raul = new Gerente(160, 1, true, 10);
			double esperado = 658000;
			double obtenido = raul.getSalario();
			assertEquals(esperado,obtenido,0.001);
			
		}
		
		@Test
		public void liquidarTest() {
			Empleado pepe = new PlantaTemporaria(80, 0, true);
			Empleado pedro = new PlantaPermanente(80, 2, true, 6);
			Empleado ana = new PlantaPermanente(160, 0, false, 4);
			Empleado raul = new Gerente(160, 1, true, 10);
			
			Empresa acme = new Empresa(10);
			
			acme.agregarEmpleado(raul);
			acme.agregarEmpleado(pepe);
			acme.agregarEmpleado(pedro);
			acme.agregarEmpleado(ana);
			
			double esperado = 1554000 ; 
			double obtenido = acme.montoTotal();
			assertEquals(esperado,obtenido,0.00001);
				
		}
		


}
