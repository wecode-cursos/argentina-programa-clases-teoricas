
public class streetNumbers {

	public static String encontrarCasaCuadratico(long n) {//O(n^2)
		long sumaIzq, sumaDer;
		String noEncontrado = "Ninguna casa cumple la condición";
		if (n < 3)
			return noEncontrado;
		for (long c = 2; c < n; c++) {//O(n)
			sumaIzq = 0;
			for (long i = 1; i < c; i++)//O(n)
				sumaIzq += i;
			sumaDer = 0;
			for (long j = c + 1; j <= n; j++) //O(n)
				sumaDer += j;
			
			if (sumaDer == sumaIzq)
				return "La casa está en la posición: " + c;
		}
		return noEncontrado;
	}
	
	public static String encontrarCasaLineal(long n) {//O(n)
		long sumaIzq, sumaDer;
		String noEncontrado = "Ninguna casa cumple la condición";
		if (n < 3)
			return noEncontrado;
		for (long c = 2; c < n; c++) { //O(n)
			sumaIzq = (c - 1) * c / 2;//O(1)
			sumaDer = (n * (n + 1) - c * (c + 1)) / 2; //O(1)
			if (sumaDer == sumaIzq)
				return "La casa está en la posición: " + c;
		}
		
		return noEncontrado;
	}
	
	
	public static String encontrarCasaConstante(long n){//O(1)
		
		String noEncontrado = "Ninguna casa cumple la condición";
		if(n<3) 
			return noEncontrado;
			
		double c= Math.sqrt((Math.pow(n, 2)+n)/2);
		
		long entera=(long)c;
		
		if((c-entera) == 0) 
			return "La casa está en la posición: " + (long) c;
		
		return noEncontrado;
	}
	
	
	public static void main(String[] args) {
		long tIni = System.currentTimeMillis();
		//System.out.println(encontrarCasa1(332928));
		long tFin = System.currentTimeMillis();
		long diff = tFin - tIni;
		System.out.println("  Tiempo de ejecucion cuadrático(milisegundos): "+diff);
		System.out.println("-----------------------------------------");
		
		tIni = System.currentTimeMillis();
		System.out.println(encontrarCasaLineal(11309768));
		tFin = System.currentTimeMillis();
		diff = tFin - tIni;
		System.out.println("  Tiempo de ejecucion lineal(milisegundos): "+diff);
		System.out.println("-----------------------------------------");
		
		tIni = System.currentTimeMillis();
		System.out.println(encontrarCasaConstante(11309768));
		tFin = System.currentTimeMillis();
		diff = tFin - tIni;
		System.out.println("  Tiempo de ejecucion constante(milisegundos): "+diff);
		System.out.println("-----------------------------------------");


	}

}
