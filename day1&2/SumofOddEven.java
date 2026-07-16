import java.util.Scanner;

public class SumofOddEven {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = sc.nextInt();
        System.out.println("enter second number:");
        int num2 = sc.nextInt();
        int sum=num1+num2;
        if(sum%2==0){
            System.out.println("the sum of given two number is even and its value is:"+sum);
        }
        else{
            System.out.println("the sum of given two number is odd and its value is:"+sum);
        }
    }
}
