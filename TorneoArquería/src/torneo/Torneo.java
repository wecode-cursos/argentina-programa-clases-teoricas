package torneo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class Torneo {

	private Map<Integer, PriorityQueue<Integer>> participantes;
	
	private TreeMap<Integer, LinkedList<Integer>> podio;

	
	public Torneo(String archivo) throws FileNotFoundException {
		setParticipantes(archivo);
		setPodio();
	}

	private void setParticipantes(String archivo) throws FileNotFoundException {
		//construimos el TreeMap participantes
		participantes = new HashMap<Integer, PriorityQueue<Integer>>();
		//abrimos el archivo
		Scanner sc = new Scanner(new File(archivo));
		//recorremos el archivo
		while (sc.hasNext()) {
			String[] datos = sc.nextLine().split(",");
			Integer key = Integer.parseInt(datos[0]);
			Integer puntaje = getPuntaje(Double.parseDouble(datos[1]), Double.parseDouble(datos[2]));

			if (puntaje > 0) {
				if (participantes.containsKey(key)) {
					participantes.get(key).offer(puntaje);
				} else {
					PriorityQueue<Integer> colaP = new PriorityQueue<Integer>(Collections.reverseOrder());
					colaP.offer(puntaje);
					participantes.put(key, colaP);
				}
			}
		}
		sc.close();
		
	}

	private void setPodio() {
		podio = new TreeMap<Integer, LinkedList<Integer>>(Collections.reverseOrder());
		
		for (Map.Entry<Integer, PriorityQueue<Integer>> entry : this.participantes.entrySet()) {
			// solo se consideran los arqueros con 5 tiros válidos o mas
			if (entry.getValue().size() >= 5) {
				Integer participante = entry.getKey();
				Integer suma = 0;
				for (int i = 0; i < 5; i++) {
					suma += entry.getValue().poll();
				}

				if (podio.containsKey(suma))
					podio.get(suma).add(participante);
				else {
					LinkedList<Integer> listaP = new LinkedList<Integer>();
					listaP.add(participante);
					podio.put(suma, listaP);
				}
			}
		}
		
	}

	public void getSalida() throws FileNotFoundException {
		Iterator<Map.Entry<Integer, LinkedList<Integer>>> itr = this.podio.entrySet().iterator();
		PrintWriter salida = new PrintWriter(new File("podio.out"));
		int i = 1;
		while (itr.hasNext() && i <= 3) {
			Map.Entry<Integer, LinkedList<Integer>> entry = itr.next();
			System.out.println(i + "° puesto: " + entry.getKey() + " puntos, participante: " + entry.getValue());
			salida.println(i + "° puesto: " + entry.getKey() + " puntos, participante: " + entry.getValue());
			i++;
		}
		salida.close();
	}

	private Integer getPuntaje(Double x, Double y) {
		Integer puntaje = 0;
		Double distanciaAlCentro = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		if (distanciaAlCentro <= 10)
			puntaje = 1000;
		else if (distanciaAlCentro <= 20)
			puntaje = 500;
		else if (distanciaAlCentro <= 30)
			puntaje = 200;
		else if (distanciaAlCentro <= 40)
			puntaje = 100;
		else if (distanciaAlCentro <= 50)
			puntaje = 50;
		else if (distanciaAlCentro > 50)
			puntaje = -1;

		return puntaje;
	}

}
