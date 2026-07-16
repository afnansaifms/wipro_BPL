package day3;

public class SecondDigit {
    static int secondLastDigit(int num) {

        num = Math.abs(num);

        if (num < 10)
            return -1;

        return (num / 10) % 10;
    }

    public static void main(String[] args) {

        System.out.println(secondLastDigit(197));    //9
        System.out.println(secondLastDigit(-197));   //9
        System.out.println(secondLastDigit(5));      //-1
    }
}

