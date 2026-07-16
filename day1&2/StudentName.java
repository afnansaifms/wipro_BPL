import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StudentName {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Student Name: ");
        String name = br.readLine();
        System.out.print("Enter Student Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}