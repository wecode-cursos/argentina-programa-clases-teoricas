import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// esto es un ejemplo minimo para  grabar sus datos en un archivo  de texto
public class EscribirConPrintWriter {

	public static void main(String[] args)	throws IOException {
		//  preparo el arch de salida
		PrintWriter salida = new PrintWriter(new FileWriter("salida.out"));
	     
	    int dni = 34567890;
	    String s = "dni:";
	    salida.print(s);      
		salida.println(" "+ dni); 
	
        for(int i=0; i<100000; i++)
            salida.println(i);


		salida.close(); //esto escribe : dni:34567890 

	}

}
