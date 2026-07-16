package hand_on_practice;

public class Assignment2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a name as a command line argument.");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}