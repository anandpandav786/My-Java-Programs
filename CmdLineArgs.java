//Program for the command line argument

public class CmdLineArgs {

    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
        else{
            System.out.println("Please Enter 2 Arguments...");
        }
    }

}
