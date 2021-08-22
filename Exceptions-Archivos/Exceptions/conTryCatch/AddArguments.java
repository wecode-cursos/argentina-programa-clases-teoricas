public class AddArguments {

    public static void main(String[] args) {

        try{
            int sum = 0;
            for(int i = 0; i < args.length; i++)
                sum += Integer.parseInt(args [i]);
            System.out.println("Sum: " + sum);

        } catch (NumberFormatException nfe) {
            System.err.println("One of the command-line arguments is not an Integer");
        }
    }
}
