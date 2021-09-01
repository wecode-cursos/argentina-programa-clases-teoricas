package getPersonas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class AppPersonas {

	public static void main(String[] args) throws IOException {

		List<Persona> personas = GestionarPersonas.getPersonas("personas.in");
		
		GestionarPersonas.escribirMayoresDeEdadOrdenadasPorEdad(personas, 30);
		
		GestionarPersonas.escribirMayoresDeEdadOrdenadasPorDNI(personas, 35);
		
		Map<Integer, ArrayList<Persona>> personasPorEdad = GestionarPersonas.agruparPorEdad(personas);
	
		GestionarPersonas.escribirPersonasAgrupadasPorEdad(personasPorEdad,"agrupadasPorEdad.out");
		
		
	}
		
}
