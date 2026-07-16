package hand_on_practice;

public class Assignment1 {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two command line arguments.");
            return;
        }

        // Generate the output in the required format
        System.out.println(args[0] + " Technologies " + args[1]);
    }
}