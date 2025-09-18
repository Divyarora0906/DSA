import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.err.println((a!=b) && (a>b));
        System.err.println((a!=b) || (a>b));
        System.err.println(!(a!=b));
    }
}
