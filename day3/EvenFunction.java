package day3;

public class EvenFunction {
    static int isEven(int num){
        if(num%2==0){
            return 2;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println(isEven(2));
    }
}
