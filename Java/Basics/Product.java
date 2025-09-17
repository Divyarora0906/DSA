import java.util.Scanner;

public class Product{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The product of a and b is: " + (a*b));
    }
}