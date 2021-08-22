public class AddArguments {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            try{
                sum += Integer.parseInt(args [i]);
            }
            catch (NumberFormatException nfe) {
                System.err.println("One of the command-line arguments " +
                    "[" + args[i] + "] is not an Integer");
            }
        }      
        System.out.println("Sum: " + sum);
    }    
}
