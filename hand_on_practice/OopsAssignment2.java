package hand_on_practice;
// Class Calculator definition
class Calculator {

    // Static method to calculate power of an integer base and exponent
    public static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Static method to calculate power of a double base and integer exponent
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

// Main class to test the Calculator class functionalities
public class OopsAssignment2 {
    public static void main(String[] args) {
        // Testing static method powerInt: 2 to the power of 10
        int intBase = 2;
        int intExponent = 10;
        double intResult = Calculator.powerInt(intBase, intExponent);
        System.out.println(intBase + " raised to the power of " + intExponent + " is: " + (int) intResult);

        // Testing static method powerDouble: 2.5 to the power of 3
        double doubleBase = 2.5;
        int doubleExponent = 3;
        double doubleResult = Calculator.powerDouble(doubleBase, doubleExponent);
        System.out.println(doubleBase + " raised to the power of " + doubleExponent + " is: " + doubleResult);
    }
}
