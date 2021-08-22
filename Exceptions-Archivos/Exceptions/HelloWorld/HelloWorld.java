public class HelloWorld {

    public static void primero(String [] greetings ){ 
        segundo(greetings);
    }

    public static void segundo(String [] greetings ){  
        int i = 0;
        while (i < 4) {
                System.out.println (greetings[i]);
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
