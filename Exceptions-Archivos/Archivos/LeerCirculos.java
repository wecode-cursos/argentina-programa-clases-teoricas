import java.io.*;

public class LeerCirculos{
    public static void main(String [] arg) {
        FileReader fr = null;
        BufferedReader br =null;
        try
        {
            fr = new FileReader("circulos.in");
            br = new BufferedReader(fr);
            String linea;

            while((linea=br.readLine())!=null) {
                try {
                    String [] coordenadas = linea.split(","); 
                    double r = Double.parseDouble(coordenadas[0]);
                    if( r <= 0)
                        throw new RadioNegativoException("Radio Negativo o cero");
                    double x = Double.parseDouble(coordenadas[1]);
                    double y = Double.parseDouble(coordenadas[2]);
                    Punto posicion = new Punto(x,y);
                    Circulo c = new Circulo(posicion,r);
                    System.out.println(c);
                }
                catch (RadioNegativoException rne){
                    System.err.println(rne.getMessage());
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



