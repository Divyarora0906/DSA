import java.util.Scanner;

public class Relational {
   public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    System.err.println("IsEqual " + (a==b));
    System.err.println("IsNotEqual " + (a!=b));
    System.err.println("Is A Greater " + (a > b));
    System.err.println("Is B Greater " + (a < b));
   }    
}
