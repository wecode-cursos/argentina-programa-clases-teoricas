import java.io.*;

public class LeerPosiciones {
    public static void main(String [] arg) {
        FileReader fr = null;
        BufferedReader br =null;
        try
        {
            fr = new FileReader("posiciones.sin");
            br = new BufferedReader(fr);
            String linea;

            while((linea=br.readLine())!=null) {
                try {
                    String [] coordenadas = linea.split(","); 
                    double x = Double.parseDouble(coordenadas[0]);
                    double y = Double.parseDouble(coordenadas[1]);
                    Punto posicion = new Punto(x,y);
                    System.out.println(posicion);
                }
                catch (NumberFormatException e) {
                    System.err.println("Uno de los datos leídos no es un double");
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally
        {
            try{                    
                if( fr != null ){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
}



