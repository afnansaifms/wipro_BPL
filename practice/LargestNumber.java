package practice;

public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 15, 2};
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
