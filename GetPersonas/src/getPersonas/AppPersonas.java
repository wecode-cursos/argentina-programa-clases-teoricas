package getPersonas;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;



public class AppPersonas {

	public static void main(String[] args) throws IOException {

		List<Persona> personas = LeerYescribirPersonas.getPersonas("personas.in");
		
		LeerYescribirPersonas.escribirMayoresDeEdadOrdenadasPorEdad(personas, 30);
		
		LeerYescribirPersonas.escribirMayoresDeEdadOrdenadasPorDNI(personas, 35);
		
		Scanner tcl = new Scanner(System.in);
		
		System.out.println("ingrese un entero");
		int a = tcl.nextInt();
		System.out.println(a);
		
		
	}
		
}
