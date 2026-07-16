package day3;

public class OddFunction {
    static int isOdd(int num){
        if(num%2==1){
            return 2;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println(isOdd(2));
        System.out.println(isOdd(9));

    }
}
