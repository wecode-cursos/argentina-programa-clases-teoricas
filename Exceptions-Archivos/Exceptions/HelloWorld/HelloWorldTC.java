public class HelloWorldTC {

    public static void primero(String [] greetings ){ 
        segundo(greetings);
    }

    public static void segundo(String [] greetings ){  
        int i = 0;
        while (i < 4) {
            try{
                System.out.println (greetings[i]);
            } catch (ArrayIndexOutOfBoundsException aiobe){
                System.err.println("Fuera de los límites del arreglo"); 
            }
            i++;
        }
    }

    public static void main (String[] args) {
        String greetings [] = {
            "Hello world!",
            "No, I mean it!",
            "HELLO WORLD!!"
        };
        primero(greetings);
    }
}



