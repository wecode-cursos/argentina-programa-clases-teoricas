package getPersonas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 1. Implementar un método estático getPersonas que reciba el nombre de un
 * archivo y devuelva un objeto LinkedList<Persona> con personas que fueron
 * leídas del archivo de texto con formato "dni apellido edad".
 *
 * 2. Implementar un método estático getPersonasMayoresAEdad que reciba un
 * objeto LinkedList<Persona> y una edad y devuelva otro objeto
 * LinkedList<Persona> con las personas cuyas edades son mayores a esa edad.
 *
 * 3. Sobreescribir los métodos: **equals** de Object para determinar que dos
 * objetos personas son iguales si sus dni´s son iguales, **toString** para
 * aplanar el objeto a una cadena que contiene los colaboradores internos del
 * objeto separado por “,”. 4. Rehacer el punto 1. pero evitando cargar del
 * archivo personas repetidas. 5. Generar el archivo personasMayoresdeX.csv con
 * el resultado del punto 2. en dos versiones: ordenado por Apellido y ordenado
 * por DNI.
 */

public class GestionarPersonas {

	public static LinkedList<Persona> getPersonas(String archivo) {
		LinkedList<Persona> personas = new LinkedList<Persona>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(archivo));

			while (sc.hasNext()) {
				// leo cada linea del archivo
				String linea = sc.nextLine();
				String datos[] = linea.split(" ");
				// creo una Persona a partir de los datos leídos de la línea.
				int dni = Integer.parseInt(datos[0]);
				String apellido = datos[1];
				int edad = Integer.parseInt(datos[2]);
				// agrego esa persona a la lista, siempre y cuando no esté repetida
				Persona p = new Persona(dni, apellido, edad);

				if (!personas.contains(p))
					personas.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// cierro el archivo
		sc.close();

		return personas;
	}

	public static void ordenarPersonasPorDNI(List<Persona> lista) {
		Collections.sort(lista, new DniComparator());
	}

	public static void ordenarPersonasPorApellido(List<Persona> lista) {
		Collections.sort(lista, new ApellidoComparator());
	}

	public static void ordenarPersonasPorEdad(List<Persona> lista) {
		Collections.sort(lista, new EdadComparator());
	}

	public static List<Persona> getPersonasMayoresDeEdad(List<Persona> personas, Integer edad) {
		// LinkedList<Persona> personasMayores = new LinkedList<Persona>();
		List<Persona> personasMayores = new ArrayList<Persona>();

		for (Persona cu : personas)
			if (cu.getEdad() > edad)
				personasMayores.add(cu);

		return personasMayores;

	}

	public static void escribirPersonas(List<Persona> personas, String file) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter(file));

		for (Persona persona : personas) {
			salida.println(persona);
		}
		salida.close();

	}
	
	
	public static void escribirMayoresDeEdadOrdenadasPorDNI(List<Persona> personas, int edad) throws IOException {

		List<Persona> personasMayores = getPersonasMayoresDeEdad(personas, edad);
		ordenarPersonasPorDNI(personasMayores);
		escribirPersonas(personasMayores, "MayoresDe" + edad + "OrdenadosPorDNI" + ".csv");

	}

	public static void escribirMayoresDeEdadOrdenadasPorEdad(List<Persona> personas, int edad) throws IOException {

		List<Persona> personasMayores = getPersonasMayoresDeEdad(personas, edad);
		ordenarPersonasPorEdad(personasMayores);
		escribirPersonas(personasMayores, "MayoresDe" + edad + "OrdenadosPorEdad" + ".csv");

	}

	public static Map<Integer, ArrayList<Persona>> agruparPorEdad(List<Persona> personas) {

		Map<Integer, ArrayList<Persona>> personasPorEdad = new TreeMap<Integer, ArrayList<Persona>>();
		
		ArrayList<Persona> aux;
		Integer key;
		
		for (Persona cadaPersona : personas) {
			key = cadaPersona.getEdad();
			
			if (personasPorEdad.containsKey(key)) {
				aux = personasPorEdad.get(key);
			
			} else {
				aux = new ArrayList<Persona>();
			}
			
			aux.add(cadaPersona);
			personasPorEdad.put(key, aux);

		}

		return personasPorEdad;

	}
	
	public static void escribirPersonasAgrupadasPorEdad(Map<Integer, ArrayList<Persona>> map, String file) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter(file));
		List<Persona> aux; 
		
		for (Entry<Integer, ArrayList<Persona>> cadaEdad : map.entrySet())  {
			
			salida.println(cadaEdad.getKey());
			aux = cadaEdad.getValue();
		
			for(Persona p : aux)
				salida.println(p.getDni() + " "+ p.getApellido()); 
		
		}
		
		salida.close();

	}
	

}