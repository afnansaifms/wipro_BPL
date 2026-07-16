package hand_on_practice;

public class SumofTwo {
    public static void main(String[] args) {
        // Convert the string arguments into numbers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate the sum
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}