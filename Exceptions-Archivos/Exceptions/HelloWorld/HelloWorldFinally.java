public class HelloWorldFinally {

    public static void main(String[] args) {

        int i = 0;
        String[] greetings = {"Hello world!",
                              "No, I mean it!",
                              "HELLO WORLD!!",
                              "Hola Java"};
        try {

            while (i < 4) {
                System.out.println(greetings[i]);
                i++;
            }
            return;       
        } 
        
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Re-setting Index Value");
            return;
        } 
        
        finally {
            System.out.println("This is always printed");
        }
    }
}          
