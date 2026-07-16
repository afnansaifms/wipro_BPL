package day3;

public class Lastdigit {
    static int lastDigit(int num) {
        return Math.abs(num % 10);
    }

    public static void main(String[] args) {

        System.out.println(lastDigit(197));    //7
        System.out.println(lastDigit(-197));   //7
    }
}

