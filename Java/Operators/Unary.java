import java.util.Scanner;

public class Unary {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.err.println("Pre Increment"+(++a));
        System.err.println("Pre Decrement"+(--a));
        
        System.err.println("Post Increment"+(a++));
        System.err.println("Post Decrement"+(a--));
    }
}
