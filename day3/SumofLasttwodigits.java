package day3;

public class SumofLasttwodigits {

    static int addLastDigits(int input1, int input2) {

        int digit1 = Math.abs(input1 % 10);
        int digit2 = Math.abs(input2 % 10);

        return digit1 + digit2;
    }

    public static void main(String[] args) {

        System.out.println(addLastDigits(267,154));     //11
        System.out.println(addLastDigits(267,-154));    //11
        System.out.println(addLastDigits(-267,154));    //11
        System.out.println(addLastDigits(-267,-154));   //11
    }
}