import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.err.println("Addition is " + (a+b));
        System.err.println("Subtraction is " + (a-b));
        System.err.println("Multiplication is " + (a*b));
        System.err.println("Division is " + (a/b));
        System.err.println("Modulo is " + (a%b));
    }
}
